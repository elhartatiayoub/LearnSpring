package org.iob.ls.model.repository;

import org.iob.ls.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Ayoub on 26/10/2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    public List<User> findByName(String name);
}
