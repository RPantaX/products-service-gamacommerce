package com.braidsbeautyByAngie.aggregates.response.products;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseListPageableItemProduct {
    private List<ResponseProductItemDetaill> responseProductList;
    private int pageNumber;
    private int pageSize;
    private int totalPages;
    private long totalElements;
    private boolean end;
}
