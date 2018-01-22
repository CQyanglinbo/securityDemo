package com.tomyang.utils;

/**
 * 状态码
 * @author yc
 * @date 2018/1/18
 */
public interface StutasCode {
    // 服务器返回返回给的响应状态码STATUS_CODE
    String STATUS_CODE_OK = "200";
    String STATUS_CODE_NOT_FOUND = "404";
    String STATUS_CODE_SERVER_ERROR = "500";

    String JSON_MSG_SUCCESS = "success";
    String JSON_MSG_FAILURE = "failure";
}
