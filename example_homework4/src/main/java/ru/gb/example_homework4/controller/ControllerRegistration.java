package ru.gb.example_homework4.controller;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.gb.example_homework4.domain.Person;
import ru.gb.example_homework4.repozitory.RepozitoryRegistration;

import java.util.List;
@Log // присвои для поиска ошибки(с его помощью нашел!)
@Controller // класс контроллер третьего задания index.html и regist.html
public class ControllerRegistration {

    private RepozitoryRegistration repozitoryRegistration;
    public ControllerRegistration(RepozitoryRegistration repozitoryRegistration){
        this.repozitoryRegistration = repozitoryRegistration;
    }

    @GetMapping("/index")
    public String showPersons(Model model){
        model.addAttribute("persons", repozitoryRegistration.allPersons());
        return "index";
    }

    @GetMapping("/registr")
    public String getPersonAll(Model model){
        model.addAttribute("person", new Person());
        return "registr";
    }

    @PostMapping("/registr")
    public String allPerson (@ModelAttribute("person") Person person){
        repozitoryRegistration.addPerson(person);
        log.info("DB add");
        return "redirect:index";
    }
}
