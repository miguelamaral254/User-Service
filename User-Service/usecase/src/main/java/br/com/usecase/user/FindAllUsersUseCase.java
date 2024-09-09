package br.com.usecase.user;

import br.com.core.domain.entities.User;
import java.util.List;

public interface FindAllUsersUseCase {
    List<User> execute();
}
