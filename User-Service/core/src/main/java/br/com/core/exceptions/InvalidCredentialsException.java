package br.com.core.domain.entities.exceptions;

public class InvalidCredentialsException extends CustomException {
    public InvalidCredentialsException(String message) {
        super("INVALID_CREDENTIALS", message);
    }
}
