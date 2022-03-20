package com.assignment.abans.controller;



import com.assignment.abans.domain.dto.AbanceProduct;
import com.assignment.abans.domain.dto.ProductCategory;
import com.assignment.abans.domain.dto.model.Product;
import com.assignment.abans.repo.ProductRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dani
 */
@RestController
@CrossOrigin
@RequestMapping("/abance/product")
public class ProductController {

    ProductRepositary productRepositary;

    public ProductController(ProductRepositary productRepositary) {
        this.productRepositary = productRepositary;
    }

    @GetMapping("/product-list")
    public List<AbanceProduct> getProductList(){
        
        List<AbanceProduct> abanceProducts = new ArrayList<>();
        AbanceProduct abanceProduct = new AbanceProduct();
        List<Product> productList=productRepositary.findAll();
        for (Product product : productList) {

            abanceProduct.setDescription(product.getDescription());
            abanceProduct.setId(product.getId());
            abanceProduct.setName(product.getName());
            abanceProduct.setImgPath(product.getImgPath());
            abanceProduct.setProduct_category(new ProductCategory("123","test", null, "ok", "test"));
            abanceProduct.setProductImageList(new ArrayList<>());
            abanceProduct.setQtyOnHand(product.getQtyOnHand());
            abanceProduct.setUnitPrice(product.getUnitPrice());
            abanceProducts.add(abanceProduct);
        }

        return abanceProducts;
    
    }
    
    
    
}
