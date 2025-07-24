package com.example.recipebook;

public class Recipe {
    String title;
    String shortDesc;
    String fullRecipe;
    int image;

    public Recipe(String title, String  shortDesc,String fullRecipe , int image) {
        this.fullRecipe = fullRecipe;
        this.image = image;
        this.shortDesc = shortDesc;
        this.title = title;
    }
}
