package com.tomyang.domain;

import lombok.Data;
import org.hibernate.annotations.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * SysRole
 * @author yc
 * @date 2018/1/16
 */

@Entity
@Data
@Table(name = "sys_role")
public class SysRole {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    public SysRole() {
    }

    public SysRole(String name) {
        this.name = name;
    }
}
