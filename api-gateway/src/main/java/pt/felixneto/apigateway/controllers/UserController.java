package pt.felixneto.apigateway.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pt.felixneto.apigateway.data.entities.User;
import pt.felixneto.apigateway.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private UserService userService;

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User getUser(@PathVariable(value = "id") String id) {
        return userService.getUserById(Long.parseLong(id));
    }
    
    @GetMapping(path = "s")
    public ResponseBody getUsers(@RequestParam(required = true, value = "name") String name,
    @RequestParam(value = "age") String age,
    @RequestParam(value = "profession") String profession) {
        return null;
    }
}
