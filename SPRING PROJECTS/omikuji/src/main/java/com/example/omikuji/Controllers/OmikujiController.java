package com.example.omikuji.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class OmikujiController {

    @GetMapping("/omikuji")
    public String inicio() {
        return "demo.jsp";
    }
    
    @PostMapping("/login")
    public String omikuji(
        @RequestParam (value="number")String number,
        @RequestParam (value="city") String city,
        @RequestParam (value="person")String person,
        @RequestParam (value="hobby")String hobby,
        @RequestParam (value="living")String living,
        @RequestParam (value="sthnice")String sthnice,
        HttpSession session) {
            session.setAttribute("number", number);
            session.setAttribute("city", city);
            session.setAttribute("person", person);
            session.setAttribute("hobby", hobby);
            session.setAttribute("living", living);
            session.setAttribute("sthnice", sthnice);
        
        return "redirect:/omikuji/show";
    }
    
    @GetMapping("/omikuji/show")
    public String mostrar() {
        return "show.jsp";
    }


}
