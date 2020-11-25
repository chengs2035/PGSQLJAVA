package com.djc8.java.play.playpgsql.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.djc8.java.play.playpgsql.model.MyPgTable;
import com.djc8.java.play.playpgsql.service.IMyPgTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * a 前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2020-11-25
 */
@RestController
@RequestMapping("/my-pg-table")
public class MyPgTableController {
    @Autowired
    private IMyPgTableService userService;
    @PostMapping("/getUser")
    public MyPgTable getUser(){
        return userService.getById(1);
    }
    @GetMapping("/getMypgtable")
    public MyPgTable getMyPgTable(){

       // List<MyPgTable> list=userService.list();
       //List<Map<String,Object>> mp=userService.lambdaQuery().


        QueryWrapper<MyPgTable> queryWrapper = new QueryWrapper<>();
        LocalDateTime ldt=LocalDateTime.now();

        queryWrapper.lambda().between(true,MyPgTable::getAddTime,ldt.plusDays(-1),ldt);
        List<MyPgTable> pglist=userService.list(queryWrapper);
        return pglist.get(0);
    }
}
