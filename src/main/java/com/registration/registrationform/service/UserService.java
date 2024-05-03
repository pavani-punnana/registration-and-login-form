package com.registration.registrationform.service;

import com.registration.registrationform.model.UserModel;
import com.registration.registrationform.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserModel userModel(String login, String firstName, String lastName, String address, String password, String email) {
        if (login != null && firstName != null && lastName != null && email != null && address != null && password != null)
        {
            return null;

        }
        else {
            UserModel userModel =new UserModel();
            userModel.setLogin(login);
            userModel.setFirstName(firstName);
            userModel.setLastName(lastName);
            userModel.setAddress(address);
            userModel.setPassword(password);
            userModel.setEmail(email);
            return userRepository.save(userModel);
        }
    }
    public UserModel authentication(String login,String password){
        return userRepository.findByLoginAndPassword(login, password).orElse(null);
    }

}
