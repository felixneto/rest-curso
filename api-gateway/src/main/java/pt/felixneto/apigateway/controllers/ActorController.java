package pt.felixneto.apigateway.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.constraints.NotEmpty;
import pt.felixneto.apigateway.data.entities.User;
import pt.felixneto.apigateway.services.UserService;

@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public User getActor(@PathVariable(value = "id") @NotEmpty String id) {
        return userService.getUserById(Long.parseLong(id));
    }
    
    @GetMapping(path = "s")
    public List<User> getActors(@RequestParam(required = true, value = "name") String name,
    @RequestParam(value = "age") String age,
    @RequestParam(value = "profession") String profession) {
        return null;
    }

    @PostMapping
    public ResponseBody createActor() {
        return null;
    }
}
