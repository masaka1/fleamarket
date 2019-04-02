package com.lyd.service;

import java.util.List;

import com.lyd.pojo.Image;

/**
 * Created by 巴赫爱吃辣条 on 2019/3/12.
 */
public interface ImageService {
    int insert(Image record);
    /**
     * 通过商品id获取该商品的图片
     * @param goodsId
     * @return
     */
    public List<Image> getImagesByGoodsPrimaryKey(Integer goodsId);

    /**
     * 通过商品Id删除商品
     * @param goodsId
     * @return
     */
    int deleteImagesByGoodsPrimaryKey(Integer goodsId);
}