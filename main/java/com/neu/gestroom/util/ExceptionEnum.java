package com.neu.gestroom.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {
    LOGINNAME_CANNOT_BU_NULL(400,"用户名不能为空"),
    LOGIN_ERROR(405,"登录失败"),
    ;
    private int code;
    private String msg;
}
