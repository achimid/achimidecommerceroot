package br.com.ecommerce.bff.root.ecommerceroot.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Lourran on 16/07/2017.
 */
@Data
public class OrderDTO {

    private Long id;
    private Date dateOrder;
    private BigDecimal finalPrice;
    private List<OrderDetailDTO> details;
}
