package br.com.core.domain.entities.exceptions;

public class UserNotFoundException extends CustomException {
    public UserNotFoundException(String message) {
        super("USER_NOT_FOUND", message);
    }
}
