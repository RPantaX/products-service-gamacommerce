package com.braidsbeautyByAngie.aggregates.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ProductCategoryDTO {

    private Long categoryId;

    private String categoryName;

}
