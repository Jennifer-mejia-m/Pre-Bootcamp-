package com.example.holamundo.Controlador;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController


public class ControladorMundo {
    
  @RequestMapping("/")
  public String home(
    @RequestParam (value="name", required = false) String name,
  @RequestParam(value="last_name", required = false) String last_name,
  @RequestParam(value="time", required = false) Integer time) {
   /* if(time !=null && time > 0 ){
    String output = "";
    for(int i=0; i<time; i++) {
        if(name != null && last_name != null) {
            output +=("Hello"+ name+" "+last_name);
        }else if (name !=null){
            output+="hello "+name;
        }else if (last_name!= null) {
            output+="hello "+last_name;
        }else{
            output+="Hello human";
        }
    }
      return output;
  } */

  if (name!= null && last_name!=null) {
    return "hello "+name+" "+last_name;
  }else if (name !=null) {
    return "hello "+name;
  }else if (last_name!=null) {
    return "hello "+last_name;
  }
  return "Hello human";    

}
}
