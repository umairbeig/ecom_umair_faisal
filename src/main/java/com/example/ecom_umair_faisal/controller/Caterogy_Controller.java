package com.example.ecom_umair_faisal.controller;

import com.example.ecom_umair_faisal.beans.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController

public class Caterogy_Controller {
    private ArrayList<Category> categories = new ArrayList<>();


    @PostMapping("/addCategory")
    public void addCategory(@RequestBody Category c) {
        categories.add(c);
    }

    @GetMapping("/getCategories")
    public ArrayList<Category> getCategories() {
        System.out.println(categories);
        return categories;
    }
    @PutMapping("/updateCateory")
        public Category updateCategory() {
            System.out.println(categories);
            return categories.get(1);
        }

    @DeleteMapping("/deleteCategory")
    public void deleteCategory(){
        System.out.println(categories);

    }



}
