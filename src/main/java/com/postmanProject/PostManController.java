package com.postmanProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostManController {
       @GetMapping(path = "/msg")
       public String getMsg() {
    	   return "hello all";
       }
}
