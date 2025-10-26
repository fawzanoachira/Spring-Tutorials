package springcrudwebapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springcrudwebapp.models.User;
import springcrudwebapp.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public int persist(User user) {
        int persist = userRepository.persist(user);

        if (persist > 1) {
            return 1;
        } else {
            return 0;
        }
    }
}
