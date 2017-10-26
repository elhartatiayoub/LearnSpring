package org.iob.ls.controller;

import org.iob.ls.model.User;
import org.iob.ls.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static javax.swing.text.StyleConstants.ModelAttribute;

/**
 * Created by Ayoub on 25/10/2017.
 */
@RestController
@RequestMapping(value = "/user")
public class AppController {
    @Autowired
    private UserService userService;


    @RequestMapping(value = "/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public ResponseEntity<User> sayHello(@PathVariable Long id){
        User user = userService.findById(id);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
    @RequestMapping(value = "/create", method = RequestMethod.POST, headers = "Accept=application/json")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User  persistedUser = userService.create(user);
        return new ResponseEntity<User>(persistedUser, HttpStatus.OK);
    }
}
