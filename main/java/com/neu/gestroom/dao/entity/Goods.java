package com.neu.gestroom.dao.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("good")
public class Goods {
    private Integer id;
    private String name;
    private String type;
    private BigDecimal price;
    private String unit;
    private String remark;
}
