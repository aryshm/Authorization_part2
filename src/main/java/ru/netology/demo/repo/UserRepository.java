package ru.netology.demo.repo;

import org.springframework.stereotype.Repository;
import ru.netology.demo.Authorities;

import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equals("admin") && password.equals("admin")) {
            return List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE);
        } else if (user.equals("user") && password.equals("user")) {
            return List.of(Authorities.READ);
        } else {
            return Collections.emptyList();
        }
    }
}