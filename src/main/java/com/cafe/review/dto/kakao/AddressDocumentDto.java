package com.cafe.review.dto.kakao;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDocumentDto {

    @JsonProperty("address_name")
    private String addressName;

    @JsonProperty("y")
    private double latitude;

    @JsonProperty("x")
    private double longitude;
}
