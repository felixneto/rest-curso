package pt.felixneto.apigateway.handlers;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import pt.felixneto.apigateway.data.v1.dtos.ExceptionResponse;
import pt.felixneto.apigateway.data.v1.dtos.ResponseData;
import pt.felixneto.apigateway.exceptions.UnsupportedTypeException;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityHandler extends ResponseEntityExceptionHandler{

    private Logger logger = Logger.getLogger(CustomizedResponseEntityHandler.class.getName());

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ResponseData<ExceptionResponse>> handleAllExceptions(Exception ex, WebRequest req) {
        logger.log(Level.SEVERE, ex.getMessage());
        return new ResponseEntity<ResponseData<ExceptionResponse>>(new ResponseData(new ExceptionResponse(new Date(), ex.getMessage(), req.getDescription(false))), HttpStatus.INTERNAL_SERVER_ERROR);
    }
    
    @ExceptionHandler(UnsupportedTypeException.class)
    public final ResponseEntity<ResponseData<ExceptionResponse>> handleUnsuportedTypeExceptions(Exception ex, WebRequest req) {
        logger.log(Level.INFO, ex.getMessage());
        return new ResponseEntity<ResponseData<ExceptionResponse>>(new ResponseData(new ExceptionResponse(new Date(), ex.getMessage(), req.getDescription(false))), HttpStatus.BAD_REQUEST);
    }
}
