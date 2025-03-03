package br.com.erudio.rest_with_spring_boot_and_java_erudio.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MathOperationException extends RuntimeException{

    public MathOperationException(String digiteApenasNúmeros) {
        super(digiteApenasNúmeros);
    }
}
