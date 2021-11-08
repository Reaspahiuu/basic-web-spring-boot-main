package com.edon.basic.web.controller;

import com.edon.basic.web.model.FitnessUserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class FitnessController {

    @GetMapping("/addfitnessusers")
    public String getFitness(Model model) {
        model.addAttribute("fitnessUser", new FitnessUserModel());
        return "AddUsers";
    }
    @PostMapping("/viewfitnessusers")
    public String createUser(@ModelAttribute FitnessUserModel fitnessUserModel, Model model) {
        model.addAttribute("fitnessUser", fitnessUserModel
        );
        return "ViewFitnessUsers";
    }
}

