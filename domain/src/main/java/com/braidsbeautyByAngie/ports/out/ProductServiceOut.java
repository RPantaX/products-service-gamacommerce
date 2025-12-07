package com.braidsbeautyByAngie.ports.out;

import com.braidsbeautyByAngie.aggregates.dto.ProductDTO;
import com.braidsbeautyByAngie.aggregates.request.RequestProduct;
import com.braidsbeautyByAngie.aggregates.request.RequestProductFilter;
import com.braidsbeautyByAngie.aggregates.response.products.*;

public interface ProductServiceOut {

    ProductDTO createProductOut(RequestProduct requestProduct);

    ResponseProduct findProductByIdOut(Long productId);

    ProductDTO updateProductOut(Long productId, RequestProduct requestProduct);

    ProductDTO deleteProductOut(Long productId);

    ResponseListPageableProduct listProductPageableOut(int pageNumber, int pageSize, String orderBy, String sortDir);
    ResponseListPageableProduct listProductPageableByCompanyIdOut(int pageNumber, int pageSize, String orderBy, String sortDir, Long companyId);

    ResponseListPageableProduct filterProductsOut(RequestProductFilter filter);
    ResponseListPageableItemProduct filterProductsByCompanyIdOut(RequestProductFilter filter, Long companyId);
    ResponseListPageableProduct filterProductsByCompanyIdDetailOut(RequestProductFilter filter, Long companyId);

    ResponseProductFilterOptions getProductFilterOptionsOut();
}
