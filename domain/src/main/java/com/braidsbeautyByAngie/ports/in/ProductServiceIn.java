package com.braidsbeautyByAngie.ports.in;

import com.braidsbeautyByAngie.aggregates.dto.ProductDTO;
import com.braidsbeautyByAngie.aggregates.request.RequestProduct;
import com.braidsbeautyByAngie.aggregates.request.RequestProductFilter;
import com.braidsbeautyByAngie.aggregates.response.products.*;

public interface ProductServiceIn {

    ProductDTO createProductIn(RequestProduct requestProduct);

    ResponseProduct findProductByIdIn(Long productId);

    ProductDTO updateProductIn(Long productId, RequestProduct requestProduct);

    ProductDTO deleteProductIn(Long productId);

    ResponseListPageableProduct listProductPageableIn(int pageNumber, int pageSize, String orderBy, String sortDir);
    ResponseListPageableProduct listProductPageableByCompanyIdIn(int pageNumber, int pageSize, String orderBy, String sortDir, Long companyId);

    ResponseListPageableProduct filterProductsIn(RequestProductFilter filter);
    ResponseListPageableItemProduct filterProductsByCompanyIdIn(RequestProductFilter filter, Long companyId);
    ResponseListPageableProduct filterProductsByCompanyIdDetailIn(RequestProductFilter filter, Long companyId);

    ResponseProductFilterOptions getProductFilterOptionsIn();
    void deleteProductsByCompanyIdIn(Long companyId);
}
