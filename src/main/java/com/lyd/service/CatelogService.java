package com.lyd.service;

import java.util.List;

import com.lyd.pojo.Catelog;

/**
 * Created by 巴赫爱吃辣条 on 2019/2/9.
 */
public interface CatelogService {
    public List<Catelog> getAllCatelog();
    public int getCount(Catelog catelog);
    Catelog selectByPrimaryKey(Integer id);
    int updateByPrimaryKey(Catelog record);
    int updateCatelogNum(Integer id,Integer number);
}
