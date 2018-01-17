package com.tomyang.dao;

import com.tomyang.domain.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * PermissionDaodao层
 * @author yc
 * @date 2018/1/16
 */
public interface PermissionDao extends JpaRepository<Permission,Integer>{
    public List<Permission> findById(Integer userId);
}
