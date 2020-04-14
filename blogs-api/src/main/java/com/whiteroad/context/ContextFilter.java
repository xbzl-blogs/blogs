package com.whiteroad.context;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.shiro.util.StringUtils;



/**
 * @author Da
 * @date 2020/4/13 13:51
 */
public class ContextFilter implements Filter {

    //标示符：表示当前用户未登录
    String NO_LOGIN_NO = "NO_LOGIN_NO";

    //排除url
    //String[]此处的url路径需要登录后，才有权访问
    String[] excludeUrls = null;


    private static String[] formatParam(String param) {
        Scanner scanner = new Scanner(param);
        List<String> urls = new ArrayList<String>();
        try {
            while (scanner.hasNextLine()) {
                String rawLine = scanner.nextLine();
                String line = StringUtils.clean(rawLine);
                if(line != null) {
                    urls.add(line);
                }
            }
        } finally {
            scanner.close();
        }
        return urls.toArray(new String[urls.size()]);
    }

    /**
     * 过滤器初始化
     * 初始化excludeUrls
     * @param filterConfig 初始化参数
     * @throws ServletException Servlet异常
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        try {
            String excludeConfig = filterConfig.getInitParameter("excludeConfig");
            if(excludeConfig != null) {
                excludeUrls = formatParam(excludeConfig);
            }
        }catch (Exception se){
            se.printStackTrace();
        }
    }

    /**
     * 判断url数组String[] excludeUrls中的url访问时是否已登录
     * @param servletRequest ServletRequest
     * @param servletResponse ServletResponse
     * @param filterChain FilterChain
     * @throws IOException IO异常
     * @throws ServletException Servlet异常
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession();
        String uri = request.getRequestURI();

//        System.out.println("filter url:"+uri);
//        System.out.println("sessionid:"+session.getId());
        boolean pass = false;
        if(excludeUrls != null){
            for(String url : excludeUrls){
                if (uri.indexOf(url)>-1){
                    pass = true;
                    break;
                }
            }
        }

        if (!pass) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            if(session.getAttribute("userKey_session") != null){
                // System.out.println("userKey_session:"+session.getAttribute("userKey_session"));
                filterChain.doFilter(request, response);
            }else{
                String requestType = request.getHeader("X-Requested-With");
                //判断是否是ajax请求
                if(requestType!=null && "XMLHttpRequest".equals(requestType)){
                    response.getWriter().write(this.NO_LOGIN_NO);
                }else{
                    response.sendRedirect(request.getContextPath()+"/user/login");
                }
                return;
            }
        }



    }

    @Override
    public void destroy() {

    }
}
