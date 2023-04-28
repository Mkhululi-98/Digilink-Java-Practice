package com.mkululi.control;

import com.mkululi.model.User;
import com.mkululi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@SpringBootApplication(scanBasePackages = {"controller","service","model","repository"})
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> get(){
       List<User> users = userService.getUsers();
       return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<User> saveUser(User user){
        User usera = userService.addUser(user);
        return new ResponseEntity<User>(usera, HttpStatus.OK);
    }
}
