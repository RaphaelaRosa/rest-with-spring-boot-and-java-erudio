package br.com.erudio.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
// ...existing code...

@ResponseStatus(HttpStatus.BAD_REQUEST) // Retorna o código 400 quando a exceção for lançada
public class UnsupportedMathOperationException extends RuntimeException {

    public UnsupportedMathOperationException(String message) {
        super(message);}

}
