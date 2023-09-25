package pt.felixneto.apigateway.data.v2.dtos;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotEmpty;

public record UserDTO(@NotEmpty @JsonProperty("first_name")String firstName, @NotEmpty @JsonProperty("last_name") String lastName, @NotEmpty String address,
        @NotEmpty String gender) {
    @JsonIgnore
    private static LocalDateTime editedAt = LocalDateTime.now();
}
