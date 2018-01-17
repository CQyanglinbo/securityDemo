package com.tomyang.dao;


import com.tomyang.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户dao层
 * @author yc
 * @date 2018/1/16
 */
public interface UserDao extends JpaRepository<SysUser,Integer>{
    public SysUser findByUsername(String username);
}
