package com.probando.probando.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ProbandoControl {

@GetMapping("/home/{name}/{age}/{phone}")
    public String home(@PathVariable("name")String name, @PathVariable ("age")Integer age, @PathVariable("phone")Integer phone) {
        return "Hola, mi nombre es "+name+" tengo "+age+" y mi número de celular es "+phone;
    }
    @GetMapping("/user")
    public String prueba(Model model) {

        String name="Jennifer";
        String lastName="Mejia Meliton";
        String email="jenniux55@gmail.com";
        int age = 33;

        model.addAttribute("name", name);
        model.addAttribute("last", lastName);
        model.addAttribute("email", email);
        model.addAttribute("age", age);
        return "demo.jsp";
    }
    
    
}
