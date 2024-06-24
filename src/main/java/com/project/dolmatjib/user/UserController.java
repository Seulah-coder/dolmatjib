package com.project.dolmatjib.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("/save")
    public ResponseEntity<Object> createUser(@RequestBody User user){
        return ResponseEntity.ok(userService.createUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getUser(@PathVariable("id") Long id){
        Optional<User> userData = userService.getUser(id);
        if(userData.isEmpty()){
            return ResponseEntity.ok(userData);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

//    @GetMapping("/{id}")
//    @ResponseBody
//    public Optional<User> getUser(@PathVariable("id") Long id){
//        return userService.getUser(id);
//    }
}
