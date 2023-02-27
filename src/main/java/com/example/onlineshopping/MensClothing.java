package com.example.onlineshopping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensClothing {
    @GetMapping("/mensclothing")
    public String getData(){
        return "Purchase mens cloths at 30% discount";
    }
}
