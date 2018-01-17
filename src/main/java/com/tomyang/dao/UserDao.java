package com.tomyang.dao;


import com.tomyang.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * 用户dao层
 * @author yc
 * @date 2018/1/16
 */
public interface UserDao extends JpaRepository<SysUser,Integer>{
    @Query(nativeQuery = true,value = "select u.*,r.name " +
            "from sys_user u " +
            "LEFT JOIN sys_role_user sru on u.id = sru.sys_user_id " +
            "LEFT JOIN sys_role r on sru.sys_role_id = r.id " +
            "WHERE username = ?1")
    public SysUser findByUsername(String username);
}
