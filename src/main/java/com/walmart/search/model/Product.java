package com.walmart.search.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Setter
@Getter
@Document(collection="products")
public class Product {

    @Id
    private String _id;
    private int id;
    private String brand;
    private String description;
    private String image;
    private int price;

    //Price with discount
    @Transient
    private int priceWithDiscount;

    //% of discount
    @Transient
    private double discount ;
}