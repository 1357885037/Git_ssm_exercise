package com.hy.ssm.exercise.controller;

import com.hy.ssm.exercise.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mq
 * @since 2020-03-24
 */
@RestController
@RequestMapping("/exercise/book")
public class BookController {

    @Autowired
    private BookServiceImpl bookServiceImpl;

    @RequestMapping("/query.do")
    public String query(){
        System.out.println("xxxxxxxxxxxxxxxxxxxxx成功！！！");
        System.out.println("xxxxxxxxxxx测试！！！");
        System.out.println(bookServiceImpl.list(null).size());
        return "/index.jsp";
    }



}
