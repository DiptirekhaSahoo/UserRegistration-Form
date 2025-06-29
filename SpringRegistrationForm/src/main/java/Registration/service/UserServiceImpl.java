// UserServiceImpl.java
package Registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Registration.entity.User;
import Registration.repository.UserRepository;

@Service
public class UserServiceImpl implements Userinterface {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }
}
