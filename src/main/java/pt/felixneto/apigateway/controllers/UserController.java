package pt.felixneto.apigateway.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping(path = "/user/{id}")
    public ResponseBody getUser(@PathVariable(value = "id") String id) {
        return null;
    }
    
    @GetMapping(path = "/users/")
    public ResponseBody getUsers(@RequestParam(required = true, value = "name") String name,
    @RequestParam(value = "age") String age,
    @RequestParam(value = "profession") String profession) {
        return null;
    }
}
