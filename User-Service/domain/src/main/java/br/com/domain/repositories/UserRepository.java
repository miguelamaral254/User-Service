package br.com.repositories;


import br.com.entities.User;

import java.util.Optional;
import java.util.List;

public interface UserRepository {

    Optional<User> findById(Integer id);
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    List<User> findAll();
    void save(User user);
    void update(User user);
    void deleteById(Integer id);
}
