package com.example.hp.project1;

public class Restaurant1menu {
    private int Food;
    private String Name;
    private String Price;
    //  private String Score;

    Restaurant1menu(int Food, String Name, String Price){
        this.Food = Food;
        this.Name = Name;
        this.Price = Price;
        //    this.Score = Score;
    }

    public int getFood(){return  Food;}
    public String getName(){
        return  Name;
    }
    public String getPrice(){
        return  Price;
    }
    // public String getScore(){return Score;}
}