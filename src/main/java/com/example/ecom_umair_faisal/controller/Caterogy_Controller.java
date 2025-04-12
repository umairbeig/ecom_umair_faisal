package com.example.ecom_umair_faisal.controller;

import com.example.ecom_umair_faisal.beans.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class Caterogy_Controller {
    private ArrayList<Category>categories=new ArrayList<>();


    @PostMapping("/addCategory")
    public void addCategory(@RequestBody Category c){
        categories.add(c);
    }

    @GetMapping("/getCategories")
    public ArrayList<Category> getCategories(){
        System.out.println(categories);
        return categories;
    }



}
