package br.com.infrastructure.repositories;

import br.com.core.domain.entities.User;
import br.com.core.repositories.UserRepository;
import br.com.infrastructure.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserRepositoryImpl implements UserRepository {

    private final UserRepository JpaUserRepository;

    @Autowired
    public UserRepositoryImpl(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public Optional<User> findById(Long id) {
        return jpaUserRepository.findById(id).map(userEntity -> userEntity);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return jpaUserRepository.findByUsername(username).map(userEntity -> userEntity);
    }

    @Override
    public void save(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(user.getId());
        userEntity.setUsername(user.getUsername());
        userEntity.setPassword(user.getPassword());
        userEntity.setRole(user.getRole());
        userEntity.setEmail(user.getEmail());
        userEntity.setFullName(user.getFullName());
        jpaUserRepository.save(userEntity);
    }

    @Override
    public void deleteById(Long id) {
        jpaUserRepository.deleteById(id);
    }
}
