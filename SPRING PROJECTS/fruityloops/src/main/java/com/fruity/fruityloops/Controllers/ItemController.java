package com.fruity.fruityloops.Controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fruity.fruityloops.Models.Item;



@Controller
public class ItemController {

      @GetMapping("")
    public String home(Model model) {

        ArrayList<Item>fruits = new ArrayList<Item>();
        fruits.add(new Item("Fresa", 5.5));
        fruits.add(new Item("Mango", 2.0));
        fruits.add(new Item("Lúcuma",4.0));
        fruits.add(new Item("Chirimoya", 3.75));

        model.addAttribute("fruta", fruits);
        return "demo.jsp";
    }
    
}
