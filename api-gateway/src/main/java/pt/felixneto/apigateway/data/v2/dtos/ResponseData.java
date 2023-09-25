package pt.felixneto.apigateway.data.v2.dtos;

import java.io.Serializable;

import jakarta.validation.constraints.NotEmpty;

public record ResponseData<T>(@NotEmpty T payload) implements Serializable{
    private static final long serialVersionUID = 1L;
}
