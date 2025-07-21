package com.librarysystem.user.infrastructure;

import com.librarysystem.loan.Infrastructure.LoanEntityMapper;
import com.librarysystem.user.domain.User;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring", uses = {LoanEntityMapper.class})
public interface UserEntityMapper {
    UserEntity toEntity(User user);

    User toDomain(UserEntity userEntity);

    List<UserEntity> toEntities(User[] users);

    List<User> toDomains(UserEntity[] authorEntities);
}
