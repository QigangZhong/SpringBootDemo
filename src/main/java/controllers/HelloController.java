package controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "hello";
    }

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class,args);
    }
}
