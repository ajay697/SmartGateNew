package com.example.www.smartgate.ActivityRecyclerView;

import java.net.URL;

public class OrdersModel {
    private String serviceName;
    private String imageUrl;
    private String orderedBy;
    private String serviceType;
    private String serviceProviderName;
    private String serviceProviderId;
    private String time;

    public OrdersModel() {
    }

    public OrdersModel(String serviceName, String orderedBy,
                       String serviceProviderName,
                       String serviceProviderId, String time) {
        this.serviceName = serviceName;
        this.imageUrl = imageUrl;
        this.orderedBy = orderedBy;
        this.serviceType = serviceType;
        this.serviceProviderName = serviceProviderName;
        this.serviceProviderId = serviceProviderId;
        this.time = time;

    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOrderedBy() {
        return orderedBy;
    }

    public void setOrderedBy(String orderedBy) {
        this.orderedBy = orderedBy;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceProviderName() {
        return serviceProviderName;
    }

    public void setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
    }

    public String getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(String serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }


}
