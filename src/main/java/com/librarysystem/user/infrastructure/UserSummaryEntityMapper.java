package com.librarysystem.user.infrastructure;

import com.librarysystem.user.domain.UserSummary;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserSummaryEntityMapper {
    UserSummary toDomain(UserEntity userEntity);

    @Mapping(target = "borrowedBooks", ignore = true)
    UserEntity toEntity(UserSummary userSummary);
}
