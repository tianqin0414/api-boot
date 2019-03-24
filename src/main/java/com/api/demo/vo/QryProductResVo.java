package com.api.demo.vo;

import java.io.Serializable;

public class QryProductResVo implements Serializable {
    private Integer productId;

    private String productName;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
