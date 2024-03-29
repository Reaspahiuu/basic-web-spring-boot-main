package com.edon.basic.web.controller;
import com.edon.basic.web.model.FitnessUserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class FitnessController {

    ArrayList<FitnessUserModel> fitnessUsers = new ArrayList<>();

    @GetMapping("/addfitnessusers")
    public String getFitness(Model model) {
        model.addAttribute("fitnessUserModel", new FitnessUserModel());
        return "AddUsers";
    }
    @PostMapping("/viewfitnessusers")
    public String createUser(@ModelAttribute FitnessUserModel fitnessUserModel, Model model) {
        fitnessUsers.add(fitnessUserModel);
        model.addAttribute("fitnessUsers", fitnessUsers);
        return "ViewUsers";
    }
    @GetMapping("/viewfitnessusers")
    public String getViewUsers(){
        return "ViewUsers";
    }
}