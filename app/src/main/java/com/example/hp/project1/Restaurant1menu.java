package com.example.hp.project1;

import android.os.Bundle;

public class Restaurant1menu {
    private int Food;
    private String Name;
    private String Price;

    Restaurant1menu(int Food, String Name, String Price){
        this.Food = Food;
        this.Name = Name;
        this.Price = Price;
    }

    public int getFood(){return  Food;}
    public String getName(){
        return  Name;
    }
    public String getPrice(){
        return  Price;
    }

}