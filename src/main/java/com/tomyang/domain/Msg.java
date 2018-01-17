package com.tomyang.domain;

import lombok.Data;

import javax.persistence.Entity;

/**
 * Msg
 * @author yc
 * @date 2018/1/16
 */
@Data
public class Msg {
    private String title;
    private String content;
    private String etraInfo;

    public Msg() {
    }

    public Msg(String title, String content, String etraInfo) {
        this.title = title;
        this.content = content;
        this.etraInfo = etraInfo;
    }
}
