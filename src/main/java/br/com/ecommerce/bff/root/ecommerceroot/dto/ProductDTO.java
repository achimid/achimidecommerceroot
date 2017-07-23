package br.com.ecommerce.bff.root.ecommerceroot.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by Lourran on 22/07/2017.
 */
@Data
public class ProductDTO {

    private Long id;
    private String name;
    private BigDecimal priceSale;
    private BigDecimal priceCost;
    private String url;
    private String description;
    private CategoryDTO category;

}
