package br.com.core.repositories;

import br.com.core.domain.entities.User;

import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(Long id);

    Optional<User> findByUsername(String username);

    void save(User user);

    void deleteById(Long id);
}
