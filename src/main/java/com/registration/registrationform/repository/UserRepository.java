package com.registration.registrationform.repository;

import com.registration.registrationform.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserModel , Integer> {
    Optional<UserModel> findByLoginAndPassword(String login,String password);


}
