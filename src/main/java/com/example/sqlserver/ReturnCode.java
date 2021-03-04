package com.example.sqlserver;

/**
 * 返回码定义
 */
public enum ReturnCode {

    success(200, "操作成功"),
    empty(201, "资源为空"),
    tokenExpire(401, "token 过期，请重新登录"),
    REQUEST_METHOD_ERROR(403, "当前接口不支持此请求方式!"),
    serverError(500, "请求无法处理,请稍后再试！"),
    fail(600, "操作失败");

    private Integer code;
    private String msg;

    ReturnCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
