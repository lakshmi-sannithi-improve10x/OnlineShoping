package com.improve10x.onlineshoping.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LineItem {
    private String id;
    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @SerializedName("fulfillable_quantity")
    private Integer fulfillableQuantity;
    @SerializedName("fulfillment_service")
    private String fulfillmentService;
    @SerializedName("fulfillment_status")
    private String fulfillmentStatus;
    @SerializedName("gift_card")
    private boolean giftCard;
    private Integer grams;
    private String name;
    @SerializedName("origin_location")
    private OriginLocation originLocation;
    @SerializedName("pre_tax_price")
    private String preTaxPrice;
    @SerializedName("pre_tax_price_set")
    private SetPrice preTaxPriceSet;
    private String price;
    @SerializedName("price_set")
    private SetPrice PriceSet;
    @SerializedName("product_exists")
    private boolean productExists;
    @SerializedName("product_id")
    private Integer productId;
    private List<String> properties;
    private Integer quantity;
    @SerializedName("requires_shipping")
    private boolean requiresShipping;
    private String sku;
    @SerializedName("tax_code")
    private String taxCode;
    private boolean taxable;
    private String title;
    @SerializedName("total_discount")
    private String totalDiscount;
    @SerializedName("total_discount_set")
    private SetPrice totalDiscountSet;
    @SerializedName("variant_id")
    private Integer variantId;
    @SerializedName("variant_inventory_management")
    private String variantInventoryManagement;
    @SerializedName("variant_title")
    private String variantTitle;
    private String vendor;
    @SerializedName("tax_lines")
    private List<TaxLine> taxLines;

    public List<TaxLine> getTaxLines() {
        return taxLines;
    }

    public void setTaxLines(List<TaxLine> taxLines) {
        this.taxLines = taxLines;
    }

    public List<String> getDuties() {
        return duties;
    }

    public void setDuties(List<String> duties) {
        this.duties = duties;
    }

    public List<String> getDiscountAllocations() {
        return discountAllocations;
    }

    public void setDiscountAllocations(List<String> discountAllocations) {
        this.discountAllocations = discountAllocations;
    }

    private List<String> duties;
    @SerializedName("discount_allocations")
    private List<String> discountAllocations;

    public OriginLocation getOriginLocation() {
        return originLocation;
    }

    public void setOriginLocation(OriginLocation originLocation) {
        this.originLocation = originLocation;
    }

    public String getPreTaxPrice() {
        return preTaxPrice;
    }

    public void setPreTaxPrice(String preTaxPrice) {
        this.preTaxPrice = preTaxPrice;
    }

    public SetPrice getPreTaxPriceSet() {
        return preTaxPriceSet;
    }

    public void setPreTaxPriceSet(SetPrice preTaxPriceSet) {
        this.preTaxPriceSet = preTaxPriceSet;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public SetPrice getPriceSet() {
        return PriceSet;
    }

    public void setPriceSet(SetPrice priceSet) {
        PriceSet = priceSet;
    }

    public boolean isProductExists() {
        return productExists;
    }

    public void setProductExists(boolean productExists) {
        this.productExists = productExists;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public boolean isRequiresShipping() {
        return requiresShipping;
    }

    public void setRequiresShipping(boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(boolean taxable) {
        this.taxable = taxable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public SetPrice getTotalDiscountSet() {
        return totalDiscountSet;
    }

    public void setTotalDiscountSet(SetPrice totalDiscountSet) {
        this.totalDiscountSet = totalDiscountSet;
    }

    public Integer getVariantId() {
        return variantId;
    }

    public void setVariantId(Integer variantId) {
        this.variantId = variantId;
    }

    public String getVariantInventoryManagement() {
        return variantInventoryManagement;
    }

    public void setVariantInventoryManagement(String variantInventoryManagement) {
        this.variantInventoryManagement = variantInventoryManagement;
    }

    public String getVariantTitle() {
        return variantTitle;
    }

    public void setVariantTitle(String variantTitle) {
        this.variantTitle = variantTitle;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdminGraphqlApiId() {
        return adminGraphqlApiId;
    }

    public void setAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
    }

    public Integer getFulfillableQuantity() {
        return fulfillableQuantity;
    }

    public void setFulfillableQuantity(Integer fulfillableQuantity) {
        this.fulfillableQuantity = fulfillableQuantity;
    }

    public String getFulfillmentService() {
        return fulfillmentService;
    }

    public void setFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
    }

    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    public void setFulfillmentStatus(String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public boolean isGiftCard() {
        return giftCard;
    }

    public void setGiftCard(boolean giftCard) {
        this.giftCard = giftCard;
    }

    public Integer getGrams() {
        return grams;
    }

    public void setGrams(Integer grams) {
        this.grams = grams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}









