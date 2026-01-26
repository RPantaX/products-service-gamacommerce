package com.braidsbeautyByAngie.rest;

import com.braidsbeautyByAngie.aggregates.response.rest.ApiResponse;
import com.braidsbeautyByAngie.aggregates.response.rest.ResponseCompany;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CircuitBreaker(name = "user-service")
@Retry(name = "user-service")
//@RateLimiter(name = "payment-service", fallbackMethod = "fallback")
//@TimeLimiter(name = "payment-service")
@FeignClient(name = "user-service")
public interface UsersCompanyAdapter {

    @GetMapping("/v1/user-service/utils/{companyId}")
    ApiResponse<ResponseCompany> getUserCompanyById(@PathVariable(name = "companyId") Long companyId);
}
