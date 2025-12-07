package com.braidsbeautyByAngie.repository.dao;

import com.braidsbeautyByAngie.aggregates.request.RequestProductFilter;
import com.braidsbeautyByAngie.aggregates.response.products.ResponseListPageableItemProduct;
import com.braidsbeautyByAngie.aggregates.response.products.ResponseListPageableProduct;
import com.braidsbeautyByAngie.aggregates.response.products.ResponseProductItemDetaill;

public interface ProductRepositoryCustom {
     ResponseListPageableProduct filterProducts(RequestProductFilter filter);
     ResponseListPageableProduct filterProductsByCompanyId(RequestProductFilter filter, Long companyId);
}
