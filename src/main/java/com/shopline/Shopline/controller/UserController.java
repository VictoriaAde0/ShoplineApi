package com.shopline.Shopline.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.shopline.Shopline.model.User;
import com.shopline.Shopline.service.UserService;

@RestController
@RequestMapping("/api/order-items")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public List<User> getAllUsers() {
            return userService.getAllUsers();
        }

        @GetMapping("/{id}")
        public Object getProductById(@PathVariable Long id) {
            return userService.getUserById(id);
        }
    }