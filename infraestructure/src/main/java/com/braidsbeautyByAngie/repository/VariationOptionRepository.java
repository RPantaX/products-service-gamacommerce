package com.braidsbeautyByAngie.repository;

import com.braidsbeautyByAngie.entity.VariationEntity;
import com.braidsbeautyByAngie.entity.VariationOptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VariationOptionRepository extends JpaRepository<VariationOptionEntity, Long> {
    boolean existsByVariationOptionValue(String name);
    List<VariationOptionEntity> findByVariationOptionValue(String name);
    List<VariationOptionEntity> findAllByVariationEntityAndStateTrue(VariationEntity variation);
}
