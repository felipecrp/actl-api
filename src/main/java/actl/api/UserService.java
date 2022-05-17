package actl.api;

import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping
    public void createUser(@RequestBody Map<String, String> userData) {
        User user = new User(null, userData.get("name"));
        userRepository.save(user);
    }

    @GetMapping
    public Iterable<User> getAllUser() {
        Iterable<User> users =  userRepository.findAll();
        return users;
    }

    @GetMapping("/{userId}")
    public Optional<User> getUser(@PathVariable Long userId) {
        Optional<User> user = userRepository.findById(userId);
        return user;
    }
}
