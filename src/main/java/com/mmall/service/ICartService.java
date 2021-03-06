package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Cart;
import com.mmall.pojo.User;
import com.mmall.vo.CartVo;

public interface ICartService {

  ServerResponse<CartVo> list (Integer userId);

  ServerResponse<CartVo> add(Integer userId, Integer productId, Integer count);

  ServerResponse<CartVo> update(Integer userId,  Integer produId, Integer count);

  ServerResponse<CartVo> deleteProduct(Integer userId, String productIds);

  ServerResponse<CartVo> selectOrUnSelect(Integer userId, Integer productId, Integer checked);

  ServerResponse<Integer> getCartProductCount(Integer userId);
}
