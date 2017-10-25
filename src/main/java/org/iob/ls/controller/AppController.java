package org.iob.ls.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ayoub on 25/10/2017.
 */
@RestController
public class AppController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<String> sayHello(){
        return new ResponseEntity<String>("hello", HttpStatus.OK);
    }
}
