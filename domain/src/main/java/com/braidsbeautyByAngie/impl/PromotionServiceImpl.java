package com.braidsbeautyByAngie.impl;

import com.braidsbeautyByAngie.aggregates.dto.PromotionDTO;
import com.braidsbeautyByAngie.aggregates.request.RequestPromotion;
import com.braidsbeautyByAngie.aggregates.response.promotions.ResponseListPageablePromotion;
import com.braidsbeautyByAngie.aggregates.response.promotions.ResponsePromotion;
import com.braidsbeautyByAngie.ports.in.PromotionServiceIn;
import com.braidsbeautyByAngie.ports.out.PromotionServiceOut;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class PromotionServiceImpl implements PromotionServiceIn {

    private final PromotionServiceOut promotionServiceOut;

    @Override
    public PromotionDTO createPromotionIn(RequestPromotion requestPromotion) {
        return promotionServiceOut.createPromotionOut(requestPromotion);
    }

    @Override
    public Optional<ResponsePromotion> findPromotionByIdIn(Long promotionId) {
        return promotionServiceOut.findPromotionByIdOut(promotionId);
    }

    @Override
    public PromotionDTO updatePromotionIn(Long promotionId, RequestPromotion requestPromotion) {
        return promotionServiceOut.updatePromotionOut(promotionId, requestPromotion);
    }

    @Override
    public PromotionDTO deletePromotionIn(Long promotionId) {
        return promotionServiceOut.deletePromotionOut(promotionId);
    }

    @Override
    public ResponseListPageablePromotion listPromotionByPageIn(int pageNumber, int pageSize, String orderBy, String sortDir) {
        return promotionServiceOut.listPromotionByPageOut(pageNumber, pageSize, orderBy, sortDir);
    }

    @Override
    public ResponseListPageablePromotion listPromotionByPageAndCompanyIdIn(int pageNumber, int pageSize, String orderBy, String sortDir, Long companyId) {
        return promotionServiceOut.listPromotionByPageAndCompanyIdOut(pageNumber, pageSize, orderBy, sortDir, companyId);
    }

    @Override
    public List<PromotionDTO> listPromotionIn() {
        return promotionServiceOut.listPromotionOut();
    }

    @Override
    public List<PromotionDTO> listPromotionByCompanyIdIn(Long companyId) {
        return promotionServiceOut.listPromotionByCompanyIdOut(companyId);
    }

    @Override
    public Optional<PromotionDTO> findPromotionByNameIn(String promotionName) {
        return promotionServiceOut.findPromotionByNameOut(promotionName);
    }
}
