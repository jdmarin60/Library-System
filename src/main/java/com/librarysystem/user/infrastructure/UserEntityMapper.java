package com.librarysystem.user.infrastructure;

import com.librarysystem.user.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring"/*, uses = {LoanEntityMapper.class}*/)
public interface UserEntityMapper {
    @Mapping(target = "borrowedBooks", ignore = true)
    UserEntity toEntity(User user);

    @Mapping(target = "borrowedBooks", ignore = true)
    User toDomain(UserEntity userEntity);

    List<UserEntity> toEntities(User[] users);

    List<User> toDomains(UserEntity[] authorEntities);
}
