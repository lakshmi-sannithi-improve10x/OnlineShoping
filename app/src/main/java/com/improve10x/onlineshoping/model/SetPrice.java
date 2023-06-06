package com.improve10x.onlineshoping.model;

import com.google.gson.annotations.SerializedName;
import com.improve10x.onlineshoping.model.LineItem;

public class SetPrice {
    @SerializedName("shop_money")
    private LineItem.Money shopMoney;

    public LineItem.Money getShopMoney() {
        return shopMoney;
    }

    public void setShopMoney(LineItem.Money shopMoney) {
        this.shopMoney = shopMoney;
    }

    public LineItem.Money getPresentmentMoney() {
        return presentmentMoney;
    }

    public void setPresentmentMoney(LineItem.Money presentmentMoney) {
        this.presentmentMoney = presentmentMoney;
    }

    @SerializedName("presentment_money")
    private LineItem.Money presentmentMoney;
}
