package com.assignment.abans.domain.dto;

import lombok.Data;

/**
 * @author Dani
 */
@Data
public class ProductCategory {
    private String id;
    private String name;
    private String createUser;
    private String status;
    private String categoryImage;
    
    public ProductCategory(String id, String name, String createUser, String status, String categoryImage) {
        this.id = id;
        this.name = name;
        this.createUser = createUser;
        this.status = status;
        this.categoryImage = categoryImage;
    }
    
    public ProductCategory() {
    }
}
