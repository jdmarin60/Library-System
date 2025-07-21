package com.librarysystem.User.Infrastructure;

import com.librarysystem.Loan.Infrastructure.LoanEntityMapper;
import com.librarysystem.User.Domain.User;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper(componentModel = "spring", uses = {LoanEntityMapper.class})
public interface UserEntityMapper {
    UserEntity toEntity(User user);

    User toDomain(UserEntity userEntity);

    List<UserEntity> toEntities(User[] users);

    List<User> toDomains(UserEntity[] authorEntities);
}
