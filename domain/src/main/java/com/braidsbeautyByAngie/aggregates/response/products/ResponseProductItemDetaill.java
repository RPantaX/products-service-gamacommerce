package com.braidsbeautyByAngie.aggregates.response.products;

import com.braidsbeautyByAngie.aggregates.response.categories.ResponseCategoryy;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseProductItemDetaill {
    private Long productItemId;
    private Long productId;
    private String productName;
    private String productDescription;
    private String productItemSKU;
    private int productItemQuantityInStock;
    private String productItemImage;
    private BigDecimal productItemPrice;
    private List<ResponseVariationn> variations;
    private ResponseCategoryy responseCategory;
}
