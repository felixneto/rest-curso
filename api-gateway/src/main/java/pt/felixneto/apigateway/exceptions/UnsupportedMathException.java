package pt.felixneto.apigateway.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathException extends RuntimeException{
}
