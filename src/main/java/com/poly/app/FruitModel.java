package com.poly.app;

import lombok.Builder;
import lombok.Data;

@Data
@Builder // Add this annotation to enable the builder pattern
public class FruitModel {
    private String name;
    private String color;
}