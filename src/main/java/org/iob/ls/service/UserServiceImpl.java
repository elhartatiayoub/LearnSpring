package org.iob.ls.service;

import org.iob.ls.exceptions.UserNotFound;
import org.iob.ls.model.User;
import org.iob.ls.model.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Ayoub on 26/10/2017.
 */

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        User createdUser = user;
        return userRepository.save(createdUser);

    }

    @Override
    @Transactional(rollbackFor=UserNotFound.class)
    public User delete(Long id) throws UserNotFound{
        User user = userRepository.findById(id).get();
        if(user == null){
            throw new UserNotFound();
        }
        userRepository.delete(user);
        return user;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
