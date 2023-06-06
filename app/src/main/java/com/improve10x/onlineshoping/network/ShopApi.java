package com.improve10x.onlineshoping.network;

import com.improve10x.onlineshoping.model.Shop;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ShopApi {

    @GET("renukaTemplates")
    Call<List<Shop>> fetchShopDetails();
}
