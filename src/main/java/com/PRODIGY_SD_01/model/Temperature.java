package com.PRODIGY_SD_01.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Temperature {
    private double value;
    private String unit; // Celsius, Fahrenheit, Kelvin

    public Temperature() {}

    public Temperature(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }
}
