package com.braidsbeautyByAngie.repository;

import com.braidsbeautyByAngie.entity.PromotionEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PromotionRepository extends JpaRepository<PromotionEntity, Long> {
    boolean existsByPromotionName(String name);

    @Query(value = "SELECT CASE WHEN COUNT(p) > 0 THEN true ELSE false END FROM PromotionEntity p WHERE p.promotionId = :promotionId AND p.state = true")
    boolean existsByPromotionIdAndStateTrue(Long promotionId);

    @Query("SELECT p FROM PromotionEntity p WHERE p.promotionId = :promotionId AND p.state = true")
    Optional<PromotionEntity> findPromotionByIdWithStateTrue(Long promotionId);

    @Query(value = "SELECT p FROM PromotionEntity p WHERE p.promotionId IN :promotionIdList AND p.state = true")
    List<PromotionEntity> findAllByPromotionIdAndStateTrue(List<Long> promotionIdList);

    @Query(value = "SELECT p FROM PromotionEntity p WHERE p.state = true")
    Page<PromotionEntity> findAllByStateTrueAmdPageable(Pageable pageable);

    @Query(value = "SELECT p FROM PromotionEntity p WHERE p.state = true AND p.companyId = :companyId")
    Page<PromotionEntity> findAllByStateTrueAndCompanyIdAndPageable(Pageable pageable, Long companyId);

    @Query(value = "SELECT p FROM PromotionEntity p WHERE p.state = true")
    List<PromotionEntity> findAllByStateTrue();

    @Query(value = "SELECT p FROM PromotionEntity p WHERE p.state = true AND p.companyId = :companyId")
    List<PromotionEntity> findAllByStateTrueAndCompanyId(Long companyId);

    Optional<PromotionEntity> findByPromotionNameAndStateTrue(String promotionName);
    //DELETE ALL BY companyId
    @Modifying
// 2. Añadir @Transactional para asegurar que la operación DELETE se ejecute dentro de una transacción.
    @Transactional
    @Query("DELETE FROM PromotionEntity p WHERE p.companyId = :companyId")
    void deleteAllByCompanyId(Long companyId);
}
