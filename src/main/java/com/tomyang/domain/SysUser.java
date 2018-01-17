package com.tomyang.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * SysUser
 * @author yc
 * @date 2018/1/16
 */
@Entity
@Data
@Table(name = "sys_user")
public class SysUser {

    @Id
    @GeneratedValue
    private Integer id;
    private String username;
    private String password;

    @Transient
    private List<SysRole> roles;

    public SysUser() {
    }

    public SysUser(String username, String password, List<SysRole> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }
}
