package com.librarysystem.user.infrastructure;

import com.librarysystem.user.domain.UserSummary;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserSummaryEntityMapper {
    UserSummary toDomain(UserEntity userEntity);

    UserEntity toEntity(UserSummary userSummary);
}
