package com.qigang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestApplication
{
    @RequestMapping("/")
    public String greeting() {
        return "Hello World!";
    }

    @RequestMapping("/test")
    public String test(){
        return "test...";
    }

    /*public static void main( String[] args )
    {
        SpringApplication.run(RestApplication.class, args);

        System.out.println( "Hello World!" );
    }*/
}