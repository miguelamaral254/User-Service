package br.com.application.usecases;


public class CreateUserUseCase {

    private final UserRepository userRepository;

    public CreateUserUseCase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse execute(UserRequest request) {
        User newUser = new User();
        newUser.setUsername(request.getUsername());
        newUser.setPassword(request.getPassword());
        newUser.setRole(request.getRole());
        newUser.setEmail(request.getEmail());
        newUser.setNomeCompleto(request.getNomeCompleto());

        userRepository.save(newUser);

        return new UserResponse(newUser.getId(), newUser.getUsername(), newUser.getEmail(), newUser.getNomeCompleto(), newUser.getRole());
    }
}
