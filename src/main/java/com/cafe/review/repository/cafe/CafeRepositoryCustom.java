package com.cafe.review.repository.cafe;

import com.cafe.review.dto.CafeReviewDto;
import com.cafe.review.dto.request.CafeSearchRequest;

import java.util.List;

public interface CafeRepositoryCustom {

    List<CafeReviewDto> findCafeWithReviewCountAndAverage(CafeSearchRequest request);
}
