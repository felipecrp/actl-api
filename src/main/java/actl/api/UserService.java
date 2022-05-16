package actl.api;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import actl.lib.entity.Repository;
import actl.lib.entity.User;
import actl.lib.entity.UserRepository;

@RestController
@RequestMapping("/users")
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    public Set<User> getAllUser() {
        Set<User> users = new HashSet<>();
        User user = new User(new Repository("repository"), "user3");
        users.add(user);
        return users;
    }


    @GetMapping("/{userId}")
    public User getUser(@PathVariable Long userId) {
        User user = new User(new Repository("repository"), "user");
        return user;
    }
}
