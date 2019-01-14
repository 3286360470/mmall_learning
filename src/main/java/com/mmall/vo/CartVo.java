package com.mmall.vo;

import java.math.BigDecimal;
import java.util.List;

public class CartVo {

  private List<CartProductVo> cartProductVoList;
  private Integer status;
  private boolean allChecked;
  private BigDecimal cartTotalPrice;
  private String imageHost;

  public String getImageHost() {
    return imageHost;
  }

  public void setImageHost(String imageHost) {
    this.imageHost = imageHost;
  }

  public List<CartProductVo> getCartProductVoList() {
    return cartProductVoList;
  }

  public void setCartProductVoList(List<CartProductVo> cartProductVoList) {
    this.cartProductVoList = cartProductVoList;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public boolean isAllChecked() {
    return allChecked;
  }

  public void setAllChecked(boolean allChecked) {
    this.allChecked = allChecked;
  }

  public BigDecimal getCartTotalPrice() {
    return cartTotalPrice;
  }

  public void setCartTotalPrice(BigDecimal cartTotalPrice) {
    this.cartTotalPrice = cartTotalPrice;
  }
}
