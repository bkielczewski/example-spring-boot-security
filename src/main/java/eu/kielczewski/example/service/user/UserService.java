package eu.kielczewski.example.service.user;

import eu.kielczewski.example.domain.User;
import eu.kielczewski.example.domain.UserCreateForm;

import java.util.Collection;
import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);

}
