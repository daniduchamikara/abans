package com.assignment.abans.domain.dto;

import lombok.Data;

import java.util.List;

/**
 * @author Dani
 */
@Data
public class AbanceProduct {
    private String id;
    private String name;
    private String description;
    private String imgPath;
    private long qtyOnHand;
    private double unitPrice;
    private String create_user_id;
    private ProductCategory product_category;
    private List<ProductImage> productImageList;
}
