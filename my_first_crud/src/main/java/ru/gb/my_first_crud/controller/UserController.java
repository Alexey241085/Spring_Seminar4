package ru.gb.my_first_crud.controller;


import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.gb.my_first_crud.model.User;
import ru.gb.my_first_crud.service.UserService;

import java.util.List;

@Controller
@Log
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/users")
    public String findAll(Model model){
        log.info("метод findAll сраблтал");
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "user-list";
        //return "home.html";
    }

    @GetMapping("/user-create")
    public String createUserForm(User user){
        log.info("метод user-create выполнен");
        return "user-create";
    }

    @PostMapping("/user-create")
    public String createUser(User user){
        log.info("запрос user-create выполнен");
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("user-delete/{id}")
    public String deleteUser(@PathVariable int id){
        log.info("метод user-delete/{id} выполнен");
        userService.deleteById(id);
        return "redirect:/users";
    }
    @GetMapping("/user-update/{id}")
    public String updateUser(User user){
        log.info("метод user-update/{id} выполнен");
        return "user-update";
    }


    @PostMapping("/user-update")
    public String update (User user){
        log.info("запрос user-update выполнен");
        userService.updateById(user.getId(), user);
        return "redirect:/users";
    }




}
