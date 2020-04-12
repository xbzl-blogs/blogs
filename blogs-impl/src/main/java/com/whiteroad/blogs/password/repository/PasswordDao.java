package com.whiteroad.blogs.password.repository;

import com.whiteroad.blogs.password.entity.PasswordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

/**
 * @author Da
 * @date 2020/4/12 9:53
 */
@Repository
public interface PasswordDao
        extends JpaRepository<PasswordEntity, Serializable> {
}
