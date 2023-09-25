package pt.felixneto.apigateway.data.v1.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotEmpty;

public record UserDTO(@NotEmpty String firstName, @NotEmpty String lastName, @NotEmpty String address,
        @NotEmpty String gender) {
    @JsonIgnore
    private static LocalDateTime editedAt = LocalDateTime.now();
}
