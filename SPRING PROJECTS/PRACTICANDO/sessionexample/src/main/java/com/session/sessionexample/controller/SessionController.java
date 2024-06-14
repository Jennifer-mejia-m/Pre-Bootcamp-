package com.session.sessionexample.controller;

import jakarta.servlet.http.HttpSession;

import org.eclipse.tags.shaded.java_cup.runtime.virtual_parse_stack;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class SessionController {


   @GetMapping("/")
    public String contador(HttpSession session) {
        Integer visita;
        if (session.getAttribute("visitas")== null ) {
            visita=1;
        } else {
            visita = (Integer) session.getAttribute("visitas");
            visita++;
        }

        session.setAttribute("visitas", visita);
        return "gracias x tu visita " + visita;
    }

   
}
