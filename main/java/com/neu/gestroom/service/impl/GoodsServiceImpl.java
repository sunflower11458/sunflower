package com.neu.gestroom.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.neu.gestroom.dao.entity.Goods;
import com.neu.gestroom.dao.mapper.GoodsMapper;
import com.neu.gestroom.service.GoodsService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public boolean getAll() {
        goodsMapper.selectList(null);
        return true;
    }
    @Override
    public boolean save(Goods good) {
        goodsMapper.insert(good);
        return true;
    }

    @Override
    public boolean deleteGoods(Integer id) {
        goodsMapper.deleteById(id);
        return true;
    }

    @Override
    public boolean updateGoods(Goods goods) {
        goodsMapper.updateById(goods);
        return true;
    }

    @Override
    public List<Goods> selectAll() {
        return goodsMapper.selectList(null);
    }

    @Override
    public Goods selectById(Integer id) {
        return goodsMapper.selectById(id);
    }

    @Override
    public List<Goods> selectByFields(Goods goods) {
        return goodsMapper.selectByFields(goods);
    }

    @Override
    public IPage<Goods> getPage(Integer currPageNo, Integer pageSize, String name) {
        IPage<Goods> page = new Page<>(currPageNo,pageSize);
        LambdaQueryWrapper<Goods> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(Strings.isNotEmpty(name),Goods::getName,name);
        goodsMapper.selectPage(page,wrapper);
        return page;
    }
}
