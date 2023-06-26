package com.neu.gestroom.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.neu.gestroom.dao.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {

    List<Goods> selectByFields(Goods goods);
}
