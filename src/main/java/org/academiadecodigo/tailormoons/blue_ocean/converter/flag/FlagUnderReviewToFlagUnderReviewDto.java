package org.academiadecodigo.tailormoons.blue_ocean.converter.flag;

import org.academiadecodigo.tailormoons.blue_ocean.converter.AbstractConverter;
import org.academiadecodigo.tailormoons.blue_ocean.dto.flag.FlagUnderReviewDto;
import org.academiadecodigo.tailormoons.blue_ocean.persistence.model.flag.FlagUnderReview;
import org.springframework.stereotype.Component;

@Component
public class FlagUnderReviewToFlagUnderReviewDto extends AbstractConverter<FlagUnderReview, FlagUnderReviewDto> {

    @Override
    public FlagUnderReviewDto convert(FlagUnderReview flagUnderReview) {

        FlagUnderReviewDto flagUnderReviewDto = new FlagUnderReviewDto();

        flagUnderReviewDto.setId(flagUnderReview.getId());
        flagUnderReviewDto.setLat(flagUnderReviewDto.getLat());
        flagUnderReviewDto.setLng(flagUnderReviewDto.getLng());
        flagUnderReviewDto.setCustomerId(flagUnderReview.getCustomer().getId());
        flagUnderReviewDto.setDescription(flagUnderReviewDto.getDescription());
        flagUnderReviewDto.setState(flagUnderReview.getState());

        return flagUnderReviewDto;
    }

}
