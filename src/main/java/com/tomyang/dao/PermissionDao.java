package com.tomyang.dao;

import com.tomyang.domain.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * PermissionDaodao层
 * @author yc
 * @date 2018/1/16
 */
public interface PermissionDao extends JpaRepository<Permission,Integer>{
    @Query(nativeQuery = true,value = "select p.* from sys_user u " +
            "LEFT JOIN sys_role_user sru on u.id = sru.sys_user_id " +
            "LEFT JOIN sys_role r on sru.sys_role_id = r.id " +
            "LEFT JOIN sys_permission_role spr on spr.role_id = r.id " +
            "LEFT JOIN sys_permission p on p.id = spr.permission_id " +
            "where u.id = ?1")
    public List<Permission> findById(Integer userId);
}
