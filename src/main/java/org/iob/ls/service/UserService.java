package org.iob.ls.service;

import org.iob.ls.exceptions.UserNotFound;
import org.iob.ls.model.User;

import java.util.List;

/**
 * Created by Ayoub on 26/10/2017.
 */
public interface UserService {

    public User create(User user);
    public User delete(Long id) throws UserNotFound;
    public User findById(Long id);
    public List<User> findAll();

}
