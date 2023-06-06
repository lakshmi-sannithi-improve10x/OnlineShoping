package com.improve10x.onlineshoping.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Shop {
    @SerializedName("_id")
    private String shopId;
    private Integer id;
    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @SerializedName("app_id")
    private Integer appId;
    @SerializedName("browser_ip")
    private String browserIp;
    @SerializedName("buyer_accepts_marketing")
    private boolean buyerAcceptsMarketing;
    @SerializedName("cancel_reason")
    private String cancelReason;
    @SerializedName("cancelled_at")
    private String cancelledAt;
    @SerializedName("cart_token")
    private String cartToken;
    @SerializedName("checkout_id")
    private Integer checkoutId;
    @SerializedName("checkout_token")
    private String checkoutToken;
    @SerializedName("client_details")
    private ClientDetails clientDetails;
    @SerializedName("closed_at")
    private String closedAt;
    private boolean confirmed;
    @SerializedName("created_at")
    private String createdAt;
    private String currency;
    @SerializedName("current_subtotal_price")
    private String currentSubtotalPrice;
    @SerializedName("current_subtotal_price_set")
    private SetPrice currentSubtotalPriceSet;
    @SerializedName("current_total_discounts")
    private String currentTotalDiscounts;
    @SerializedName("current_total_discounts_set")
    private SetPrice currentTotalDiscountsSet;
    @SerializedName("current_total_duties_set")
    private String currentTotalDutiesSet;
    @SerializedName("current_total_price")
    private String currentTotalPrice;
    @SerializedName("current_total_price_set")
    private SetPrice currentTotalPriceSet;
    @SerializedName("current_total_tax")
    private String currentTotalTax;
    @SerializedName("current_total_tax_set")
    private SetPrice currentTotalTaxSet;
    @SerializedName("customer_locale")
    private String customerLocale;
    @SerializedName("device_id")
    private String deviceId;
    @SerializedName("discount_codes")
    private List<String> discountCodes;
    @SerializedName("estimated_taxes")
    private boolean estimatedTaxes;
    @SerializedName("financial_status")
    private String financialStatus;
    @SerializedName("fulfillment_status")
    private String fulfillmentStatus;
    private String gateway;
    @SerializedName("landing_site")
    private String landingSite;
    @SerializedName("landing_site_ref")
    private String landingSiteRef;
    @SerializedName("location_id")
    private String locationId;
    private String name;
    private String note;
    @SerializedName("note_attributes")
    private List<String> noteAttributes;
    private Integer number;
    @SerializedName("order_number")
    private Integer orderNumber;
    @SerializedName("order_status_url")
    private String orderStatusUrl;
    @SerializedName("original_total_duties_set")
    private String originalTotalDutiesSet;
    @SerializedName("payment_gateway_names")
    private List<String> paymentGatewayNames;
    @SerializedName("presentment_currency")
    private String presentmentCurrency;
    @SerializedName("processed_at")
    private String processedAt;
    @SerializedName("processing_method")
    private String processingMethod;
    private String reference;
    @SerializedName("referring_site")
    private String referringSite;
    @SerializedName("source_identifier")
    private String sourceIdentifier;
    @SerializedName("source_name")
    private String source_name;
    @SerializedName("source_url")
    private String source_url;
    @SerializedName("subtotal_price")
    private String subtotalPrice;
    @SerializedName("subtotal_price_set")
    private SetPrice subtotalPriceSet;
    private String tags;
    @SerializedName("taxes_included")
    private Boolean taxesIncluded;
    private Boolean test;
    private String token;
    @SerializedName("total_discounts")
    private String totalDiscounts;
    @SerializedName("total_discounts_set")
    private SetPrice totalDiscountsSet;
    @SerializedName("total_line_items_price")
    private String totalLineItemsPrice;
    @SerializedName("total_line_items_price_set")
    private SetPrice totalLineItemsPriceSet;
    @SerializedName("total_outstanding")
    private String totalOutstanding;
    @SerializedName("total_price")
    private String total_price;
    @SerializedName("total_price_set")
    private SetPrice totalPriceSet;
    @SerializedName("total_price_usd")
    private String total_price_usd;
    @SerializedName("total_shipping_price_set")
    private SetPrice totalShippingPriceSet;
    @SerializedName("total_tax")
    private String totalTax;
    @SerializedName("total_tax_set")
    private SetPrice totalTaxSet;
    @SerializedName("total_tip_received")
    private String totalTipReceived;
    @SerializedName("total_weight")
    private Integer totalWeight;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("discount_applications")
    private List<String> discountApplications;
    private List<String> fulfillments;
    @SerializedName("line_items")
    private List<LineItem> lineItems;
    @SerializedName("payment_terms")
    private String paymentTerms;
    private List<String> refunds;

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public List<String> getRefunds() {
        return refunds;
    }

    public void setRefunds(List<String> refunds) {
        this.refunds = refunds;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminGraphqlApiId() {
        return adminGraphqlApiId;
    }

    public void setAdminGraphqlApiId(String adminGraphqlApiId) {
        this.adminGraphqlApiId = adminGraphqlApiId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getBrowserIp() {
        return browserIp;
    }

    public void setBrowserIp(String browserIp) {
        this.browserIp = browserIp;
    }

    public boolean isBuyerAcceptsMarketing() {
        return buyerAcceptsMarketing;
    }

    public void setBuyerAcceptsMarketing(boolean buyerAcceptsMarketing) {
        this.buyerAcceptsMarketing = buyerAcceptsMarketing;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getCancelledAt() {
        return cancelledAt;
    }

    public void setCancelledAt(String cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public String getCartToken() {
        return cartToken;
    }

    public void setCartToken(String cartToken) {
        this.cartToken = cartToken;
    }

    public Integer getCheckoutId() {
        return checkoutId;
    }

    public void setCheckoutId(Integer checkoutId) {
        this.checkoutId = checkoutId;
    }

    public String getCheckoutToken() {
        return checkoutToken;
    }

    public void setCheckoutToken(String checkoutToken) {
        this.checkoutToken = checkoutToken;
    }

    public ClientDetails getClientDetails() {
        return clientDetails;
    }

    public String getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrentSubtotalPrice() {
        return currentSubtotalPrice;
    }

    public void setCurrentSubtotalPrice(String currentSubtotalPrice) {
        this.currentSubtotalPrice = currentSubtotalPrice;
    }

    public SetPrice getCurrentSubtotalPriceSet() {
        return currentSubtotalPriceSet;
    }

    public void setCurrentSubtotalPriceSet(SetPrice currentSubtotalPriceSet) {
        this.currentSubtotalPriceSet = currentSubtotalPriceSet;
    }

    public String getCurrentTotalDiscounts() {
        return currentTotalDiscounts;
    }

    public void setCurrentTotalDiscounts(String currentTotalDiscounts) {
        this.currentTotalDiscounts = currentTotalDiscounts;
    }

    public SetPrice getCurrentTotalDiscountsSet() {
        return currentTotalDiscountsSet;
    }

    public void setCurrentTotalDiscountsSet(SetPrice currentTotalDiscountsSet) {
        this.currentTotalDiscountsSet = currentTotalDiscountsSet;
    }

    public String getCurrentTotalDutiesSet() {
        return currentTotalDutiesSet;
    }

    public void setCurrentTotalDutiesSet(String currentTotalDutiesSet) {
        this.currentTotalDutiesSet = currentTotalDutiesSet;
    }

    public String getCurrentTotalPrice() {
        return currentTotalPrice;
    }

    public void setCurrentTotalPrice(String currentTotalPrice) {
        this.currentTotalPrice = currentTotalPrice;
    }

    public SetPrice getCurrentTotalPriceSet() {
        return currentTotalPriceSet;
    }

    public void setCurrentTotalPriceSet(SetPrice currentTotalPriceSet) {
        this.currentTotalPriceSet = currentTotalPriceSet;
    }

    public String getCurrentTotalTax() {
        return currentTotalTax;
    }

    public void setCurrentTotalTax(String currentTotalTax) {
        this.currentTotalTax = currentTotalTax;
    }

    public SetPrice getCurrentTotalTaxSet() {
        return currentTotalTaxSet;
    }

    public void setCurrentTotalTaxSet(SetPrice currentTotalTaxSet) {
        this.currentTotalTaxSet = currentTotalTaxSet;
    }

    public String getCustomerLocale() {
        return customerLocale;
    }

    public void setCustomerLocale(String customerLocale) {
        this.customerLocale = customerLocale;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public List<String> getDiscountCodes() {
        return discountCodes;
    }

    public void setDiscountCodes(List<String> discountCodes) {
        this.discountCodes = discountCodes;
    }

    public boolean isEstimatedTaxes() {
        return estimatedTaxes;
    }

    public void setEstimatedTaxes(boolean estimatedTaxes) {
        this.estimatedTaxes = estimatedTaxes;
    }

    public String getFinancialStatus() {
        return financialStatus;
    }

    public void setFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus;
    }

    public String getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    public void setFulfillmentStatus(String fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getLandingSite() {
        return landingSite;
    }

    public void setLandingSite(String landingSite) {
        this.landingSite = landingSite;
    }

    public String getLandingSiteRef() {
        return landingSiteRef;
    }

    public void setLandingSiteRef(String landingSiteRef) {
        this.landingSiteRef = landingSiteRef;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public List<String> getNoteAttributes() {
        return noteAttributes;
    }

    public void setNoteAttributes(List<String> noteAttributes) {
        this.noteAttributes = noteAttributes;
    }

    public String getOrderStatusUrl() {
        return orderStatusUrl;
    }

    public void setOrderStatusUrl(String orderStatusUrl) {
        this.orderStatusUrl = orderStatusUrl;
    }

    public String getOriginalTotalDutiesSet() {
        return originalTotalDutiesSet;
    }

    public void setOriginalTotalDutiesSet(String originalTotalDutiesSet) {
        this.originalTotalDutiesSet = originalTotalDutiesSet;
    }

    public String getPresentmentCurrency() {
        return presentmentCurrency;
    }

    public void setPresentmentCurrency(String presentmentCurrency) {
        this.presentmentCurrency = presentmentCurrency;
    }

    public String getProcessedAt() {
        return processedAt;
    }

    public void setProcessedAt(String processedAt) {
        this.processedAt = processedAt;
    }

    public String getProcessingMethod() {
        return processingMethod;
    }

    public void setProcessingMethod(String processingMethod) {
        this.processingMethod = processingMethod;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReferringSite() {
        return referringSite;
    }

    public void setReferringSite(String referringSite) {
        this.referringSite = referringSite;
    }

    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public String getSource_url() {
        return source_url;
    }

    public void setSource_url(String source_url) {
        this.source_url = source_url;
    }


    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Boolean getTaxesIncluded() {
        return taxesIncluded;
    }

    public void setTaxesIncluded(Boolean taxesIncluded) {
        this.taxesIncluded = taxesIncluded;
    }

    public Boolean getTest() {
        return test;
    }

    public void setTest(Boolean test) {
        this.test = test;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTotalDiscounts() {
        return totalDiscounts;
    }

    public void setTotalDiscounts(String totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    public SetPrice getTotalDiscountsSet() {
        return totalDiscountsSet;
    }

    public void setTotalDiscountsSet(SetPrice totalDiscountsSet) {
        this.totalDiscountsSet = totalDiscountsSet;
    }

    public String getTotalLineItemsPrice() {
        return totalLineItemsPrice;
    }

    public void setTotalLineItemsPrice(String totalLineItemsPrice) {
        this.totalLineItemsPrice = totalLineItemsPrice;
    }

    public SetPrice getTotalLineItemsPriceSet() {
        return totalLineItemsPriceSet;
    }

    public void setTotalLineItemsPriceSet(SetPrice totalLineItemsPriceSet) {
        this.totalLineItemsPriceSet = totalLineItemsPriceSet;
    }

    public String getTotalOutstanding() {
        return totalOutstanding;
    }

    public void setTotalOutstanding(String totalOutstanding) {
        this.totalOutstanding = totalOutstanding;
    }

    public String getTotal_price() {
        return total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    public SetPrice getTotalPriceSet() {
        return totalPriceSet;
    }

    public void setTotalPriceSet(SetPrice totalPriceSet) {
        this.totalPriceSet = totalPriceSet;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    public SetPrice getTotalTaxSet() {
        return totalTaxSet;
    }

    public void setTotalTaxSet(SetPrice totalTaxSet) {
        this.totalTaxSet = totalTaxSet;
    }

    public String getTotalTipReceived() {
        return totalTipReceived;
    }

    public void setTotalTipReceived(String totalTipReceived) {
        this.totalTipReceived = totalTipReceived;
    }

    public Integer getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Integer totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getDiscountApplications() {
        return discountApplications;
    }

    public void setDiscountApplications(List<String> discountApplications) {
        this.discountApplications = discountApplications;
    }

    public List<String> getFulfillments() {
        return fulfillments;
    }

    public void setFulfillments(List<String> fulfillments) {
        this.fulfillments = fulfillments;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<String> getPaymentGatewayNames() {
        return paymentGatewayNames;
    }

    public void setPaymentGatewayNames(List<String> paymentGatewayNames) {
        this.paymentGatewayNames = paymentGatewayNames;
    }

    public String getSubtotalPrice() {
        return subtotalPrice;
    }

    public void setSubtotalPrice(String subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }

    public SetPrice getSubtotalPriceSet() {
        return subtotalPriceSet;
    }

    public void setSubtotalPriceSet(SetPrice subtotalPriceSet) {
        this.subtotalPriceSet = subtotalPriceSet;
    }

    public String getTotal_price_usd() {
        return total_price_usd;
    }

    public void setTotal_price_usd(String total_price_usd) {
        this.total_price_usd = total_price_usd;
    }

    public SetPrice getTotalShippingPriceSet() {
        return totalShippingPriceSet;
    }

    public void setTotalShippingPriceSet(SetPrice totalShippingPriceSet) {
        this.totalShippingPriceSet = totalShippingPriceSet;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public void setClientDetails(ClientDetails clientDetails) {
        this.clientDetails = clientDetails;


    }

}
