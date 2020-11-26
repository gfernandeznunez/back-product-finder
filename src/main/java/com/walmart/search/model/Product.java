package com.walmart.search.model;

import org.springframework.data.annotation.Id;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Data
@Document(collection="products")
public class Product {

    @Id
    private String _id;

    private int id;
    private String brand;
    private String description;
    private String image;
    private Double price;

    //Price with discount
    private Double priceWithDiscount;

    //% of discount
    private Double discount ;
}
