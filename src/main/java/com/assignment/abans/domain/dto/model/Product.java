package com.assignment.abans.domain.dto.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Dani
 */
@Data
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String description;
    private long qtyOnHand;
    private double unitPrice;
    private String userId;
    private String statusId;
    private String productCat;
    private String imgPath;

}
