package com.tlotlanang.virtualstockexchangebackend.homeLander;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface homeLandingMapper {

    HomeLandingEntity toDto(HomeLandingDto homeLandingDto);
    HomeLandingDto toEntity(HomeLandingEntity homeLandingEntity);
}
