package com.example.ecom_umair_faisal.beans;

import org.springframework.stereotype.Component;

@Component
public class Category {

    String id;
    String name;

    public void method(){
        System.out.println("hi i am a bean of class category");
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
