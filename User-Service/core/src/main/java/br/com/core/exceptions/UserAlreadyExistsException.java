package br.com.core.domain.entities.exceptions;

public class UserAlreadyExistsException extends CustomException {
    public UserAlreadyExistsException(String message) {
        super("USER_ALREADY_EXISTS", message);
    }
}
