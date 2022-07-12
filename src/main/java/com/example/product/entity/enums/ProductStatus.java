package com.example.product.entity.enums;

public enum ProductStatus {
    SALE(1),
    STOP(0);

    private int value;
    ProductStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static ProductStatus of(int value) {
        for (ProductStatus productStatus : ProductStatus.values()) {
            if(productStatus.getValue() == value) {
                return productStatus;
            }
        }
        return ProductStatus.SALE;
    }
}
