package com.neu.gestroom.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DemoException extends RuntimeException{

    private ExceptionEnum exceptionEnum;
}
