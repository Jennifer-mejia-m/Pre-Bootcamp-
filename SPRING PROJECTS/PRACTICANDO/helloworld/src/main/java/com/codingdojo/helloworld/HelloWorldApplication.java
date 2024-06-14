package com.codingdojo.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("hello")



@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

@RequestMapping("/home")
public String saludo () {
    return "Hola Mundo";
}

@RequestMapping("/user")
public String second() {
    return "Hola amiguitos";
}

@RequestMapping("/fiesta")
public String fiestaName() {
    return "Ecoferia nuevo chimbote";
}




}
