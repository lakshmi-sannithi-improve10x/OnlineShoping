package com.improve10x.onlineshoping.model;

import com.google.gson.annotations.SerializedName;

public class ClientDetails {
    @SerializedName("accept_language")
    private String acceptLanguage;
    @SerializedName("browser_height")
    private Integer browserHeight;
    @SerializedName("browser_ip")
    private String browserIp;
    @SerializedName("browser_width")
    private Integer browserWidth;
    @SerializedName("session_hash")
    private String sessionHash;
    @SerializedName("user_agent")
    private String userAgent;
    @SerializedName("current_subtotal_price_set")
    private SetPrice setPrice;

}
