package com.neu.gestroom.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.neu.gestroom.dao.entity.Goods;
import com.neu.gestroom.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/good")
public class GoodController {

    @Autowired
    private GoodsService goodService;

    @GetMapping
    public List<Goods> getAll(){
        return goodService.selectAll();
    }

    @PostMapping
    public boolean addGood(@RequestBody Goods goods){
        return goodService.save(goods);
    }

    @PutMapping
    public boolean updateGood(@RequestBody Goods goods){
        return goodService.updateGoods(goods);
    }

    @DeleteMapping("{id}")
    public boolean deleteGood(@PathVariable Integer id){
        return goodService.deleteGoods(id);
    }

    @GetMapping("{id}")
    public Goods getFloorByCondition(@PathVariable Integer id){
        return goodService.selectById(id);
    }

    @GetMapping("{currPageNo}/{pageSize}")
    public IPage<Goods> getPage(@PathVariable Integer currPageNo, @PathVariable Integer pageSize,
                                @RequestParam("query") String name){
        return goodService.getPage(currPageNo,pageSize,name);
    }
}
