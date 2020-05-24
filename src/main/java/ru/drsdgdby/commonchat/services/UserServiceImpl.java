package ru.drsdgdby.commonchat.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.drsdgdby.commonchat.entities.User;
import ru.drsdgdby.commonchat.repositories.UserRepository;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
}
