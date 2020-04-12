package com.whiteroad.blogs.waterfallelements.controller;

import com.whiteroad.blogs.waterfallelements.vo.WaterfallElementsVo;
import com.whiteroad.database.JsonBackData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Da
 * @date 2020/4/10 13:41
 * 文章控制类
 */
@Controller
@RequestMapping(value = "waterfallElementsController")
public class WaterfallElementsController {




    @RequestMapping(value = "queryList")
    @ResponseBody
    public JsonBackData queryList() {
        JsonBackData back = new JsonBackData();
        try {
            List<WaterfallElementsVo> page = new ArrayList<>();
            WaterfallElementsVo vo1 = new WaterfallElementsVo();
            vo1.setId("1");
            vo1.setName("新闻1");
            vo1.setValue("Java Persistence API定义了一种定义，可以将常规的普通Java对象（有时被称作POJO）映射到数据库。\n" +
                    "这些普通Java对象被称作Entity Bean。\n" +
                    "除了是用Java Persistence元数据将其映射到数据库外，Entity Bean与其他Java类没有任何区别。\n" +
                    "事实上，创建一个Entity Bean对象相当于新建一条记录，删除一个Entity Bean会同时从数据库中删除对应记录，修改一个Entity Bean时，容器会自动将Entity Bean的状态和数据库同步。\n" +
                    "\n" +
                    "Java Persistence API还定义了一种查询语言（JPQL），具有与SQL相类似的特征，只不过做了裁减，以便处理Java对象而非原始的关系表。");

            WaterfallElementsVo vo2 = new WaterfallElementsVo();
            vo2.setId("2");
            vo2.setName("新闻2");
            vo2.setValue("@Column注释定义了将成员属性映射到关系表中的哪一列和该列的结构信息，属性如下：\n" +
                    "　　1）name：映射的列名。如：映射tbl_user表的name列，可以在name属性的上面或getName方法上面加入；\n" +
                    "　　2）unique：是否唯一；\n" +
                    "　　3）nullable：是否允许为空；\n" +
                    "　　4）length：对于字符型列，length属性指定列的最大字符长度；\n" +
                    "　　5）insertable：是否允许插入；\n" +
                    "　　6）updatetable：是否允许更新；\n" +
                    "　　7）columnDefinition：定义建表时创建此列的DDL；\n" +
                    "　　8）secondaryTable：从表名。如果此列不建在主表上（默认是主表），该属性定义该列所在从表的名字");

            page.add(vo1);
            page.add(vo2);
            back.setBackData(page);
            back.setSuccess(true);
            back.setBackMsg("查询列表信息成功");
        } catch (Exception e) {
            back.setSuccess(false);
            back.setBackMsg("查询列表信息失败:"+e.getMessage());
        }
        return back;
    }

}
