package com.mmall.dao;

import com.mmall.pojo.Shipping;

import java.util.List;

public interface ShippingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shipping record);

    int insertSelective(Shipping record);

    Shipping selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shipping record);

    int updateByPrimaryKey(Shipping record);

    int deleteByShippingIdUserId(Integer userid, Integer shippingId);

    int updateByShipping(Shipping shipping);

    Shipping selectByShippingIdUserId(Integer userId, Integer shippingId);

    List<Shipping> selectByUserId(Integer userId);
}