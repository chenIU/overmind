package com.example.overmind.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author：chenjianyin
 * @date：2019/11/5 14:57
 * @desc：
 */
@RestController
@RequestMapping("/api/market/")
public class UserController {

    @RequestMapping("getUserinfo")
    public String getUserinfo(){
        return "hello world";
    }

}
