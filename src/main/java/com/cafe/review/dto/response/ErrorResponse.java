package com.cafe.review.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
public class ErrorResponse {

    private final int code;
    private final String message;
    private final Map<String, String> validation;

    @Builder
    private ErrorResponse(int code, String message, Map<String, String> validation) {
        this.code = code;
        this.message = message;
        this.validation = validation;
    }

    public void addValidation(String fieldName, String errorMessage) {
        this.validation.put(fieldName, errorMessage);
    }

}