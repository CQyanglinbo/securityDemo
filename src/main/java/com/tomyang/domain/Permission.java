package com.tomyang.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Permission
 * @author yc
 * @date 2018/1/16
 */
@Entity
@Data
@Table(name = "sys_permission")
public class Permission {

    @Id
    @GeneratedValue
    private int id;
    //权限名称
    private String name;

    //权限描述
    private String descritpion;

    //授权链接
    private String url;

    //父节点id
    private int pid;

    public Permission(String name, String descritpion, String url, int pid) {
        this.name = name;
        this.descritpion = descritpion;
        this.url = url;
        this.pid = pid;
    }

    public Permission() {
    }
}
