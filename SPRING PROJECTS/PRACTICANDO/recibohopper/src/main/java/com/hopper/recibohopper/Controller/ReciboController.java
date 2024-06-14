package com.hopper.recibohopper.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("")

public class ReciboController {

    @GetMapping("")
    public String index(Model model) {

        String name="Grace Hopper";
        String itemName="Alambre de cobre";
        double price=5.25;
        String description="Tiras de metal, otra ilustración de nanosegundos.";
        String vendor="Tienda de la esquina Pequeñas Cosas";

        model.addAttribute("name", name);
        model.addAttribute("item", itemName);
        model.addAttribute("price", price);
        model.addAttribute("descr", description);
        model.addAttribute("vendor", vendor);

        return "index.jsp";
    }

    @GetMapping("/dat")
    public String fecha(Model model) {
        
        Date today= new Date();
        model.addAttribute("fecha", today);
        return "fecha.jsp";
    }    
    
    @GetMapping("/color")
    public String colors() {
        return "los colores";
    }
    

}
