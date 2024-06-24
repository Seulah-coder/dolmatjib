package com.project.dolmatjib.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public Optional<User> getUser(Long id){
        return userRepository.findById(id);
    }

    public User updateUser(Long id, User user){
        final Optional<User> fetchedUser = userRepository.findById(id);
        if(fetchedUser.isPresent()){
            user.setId(id);
            return userRepository.save(user);
        } else {
            return null;
        }
    }

    public User patchUser(Long id, User user){
        final Optional<User> fetchedUser = userRepository.findById(id);
        if(fetchedUser.isPresent()){
            if(user.getUserName() != null){
                fetchedUser.get().setUserName(user.getUserName());
            }
            return userRepository.save(fetchedUser.get());

        } else {
            return null;
        }
    }

    public boolean deleteUser(Long id){
        final Optional<User> fetchedUser = userRepository.findById(id);
        if(fetchedUser.isPresent()){
            userRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }



}
