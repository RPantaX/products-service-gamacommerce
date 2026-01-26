package com.braidsbeautyByAngie.aggregates.response.rest;

import lombok.*;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResponseCompany {
    private Long id;

    private String companyRuc;

    private String companyName;

    private String companyTradeName;

    private String companyPhone;

    private String companyEmail;

    private String documentTypeName;

    private String companyDocumentNumber;

    private String companyTypeName;

    private String image;
}
