package com.example.product.entity.enums;

public enum GenderStatus {
    Male(0),
    FeMale(1);

    private int value;
    GenderStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static GenderStatus of(int value) {
        for (GenderStatus genderStatus : GenderStatus.values()) {
            if(genderStatus.getValue() == value) {
                return genderStatus;
            }
        }
        return GenderStatus.Male;
    }
}
