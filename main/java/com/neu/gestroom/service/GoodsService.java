package com.neu.gestroom.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.neu.gestroom.dao.entity.Goods;

import java.util.List;

public interface GoodsService {
    boolean getAll();

    boolean save(Goods goods);

    boolean deleteGoods(Integer id);

    boolean updateGoods(Goods goods);

    List<Goods> selectAll();

    Goods selectById(Integer id);

    List<Goods> selectByFields(Goods goods);

    IPage<Goods> getPage(Integer currPageNo, Integer pageSize, String name);

}
