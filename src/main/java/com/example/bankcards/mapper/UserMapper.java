package com.example.bankcards.mapper;

import com.example.bankcards.dto.request.UserRequestDto;
import com.example.bankcards.dto.response.UserResponseDto;
import com.example.bankcards.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponseDto toUserResponseDto(User user);

    @Mapping(target = "password", ignore = true)
    @Mapping(target = "isEnabled", constant = "true")
    @Mapping(target = "createdAt", expression = "java(java.time.Instant.now())")
    User toEntity(UserRequestDto dto);
}
