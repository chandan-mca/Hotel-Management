package com.mca.user.service.dto.response;

import lombok.Builder;
import org.springframework.http.HttpStatus;

@Builder
public record ErrorResponse(
        String message,
        boolean success,
        HttpStatus status) {
}
