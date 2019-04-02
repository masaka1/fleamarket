package com.lyd.controller;

import org.springframework.stereotype.Controller;

import com.lyd.service.CatelogService;

import javax.annotation.Resource;

/**
 * Created by 巴赫爱吃辣条 on 2019/2/9.
 */
@Controller
public class CatelogController {
    @Resource
    private CatelogService catelogService;

}
