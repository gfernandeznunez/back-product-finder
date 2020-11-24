package com.walmart.search.model;

import org.springframework.data.annotation.Id;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Product {

    @Id
    private int id;

    private String brand;
    private String description;
    private String image;
    private Double price;

    private Double priceWithDiscount;
    private Double discount ;
}
