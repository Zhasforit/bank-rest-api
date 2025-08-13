package com.example.bankcards.dto.request;

import com.example.bankcards.entity.enums.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.Set;

public record UserRequestDto(

        @NotBlank(message = "Username is required")
        @Size(min = 4, max = 30, message = "Username must be from 4 to 30 characters")
        String username,

        @NotBlank(message = "Password is required")
        @Size(min = 8, message = "Password must contain at least 8 characters")
        String password,

        @NotEmpty(message = "'ROLE_USER' or 'ROLE_ADMIN' is required")
        Set<Role> roles
) {
}
