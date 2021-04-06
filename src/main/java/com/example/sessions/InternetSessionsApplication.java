package com.example.sessions;

import com.example.sessions.model.User;
import com.example.sessions.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@AllArgsConstructor //Позвоялет получить конструктор по умолчанию с 1 параметром userRepository
public class InternetSessionsApplication implements ApplicationRunner {

    final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(InternetSessionsApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        userRepository.save(new User("Roza Hutor","roza", Set.of(Role.ADMIN)));
//        userRepository.save(new User("Cris Button","cris", Set.of(Role.USER)));
//        userRepository.save(new User("Fray Tynnig","fray", Set.of(Role.ADMIN,Role.USER)));
        List<User> users=userRepository.findAll();
    }
}
