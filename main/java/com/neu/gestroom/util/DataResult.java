package com.neu.gestroom.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataResult {

    private Boolean flag;
    private int status;
    private String message;
    private Long timeStamp = System.currentTimeMillis();
    private Object data;

    public DataResult(ExceptionEnum exceptionEnum){
        this.status = exceptionEnum.getCode();
        this.message = exceptionEnum.getMsg();
    }
}
