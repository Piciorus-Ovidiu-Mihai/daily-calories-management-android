package com.application.dailycaloriesmanagement.ui.foodlist;

import java.util.ArrayList;

public class Food {

    private String mName;
    private String mDescription;
    private String mCalories;


    public String getmName() {
        return mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmCalories() {
        return mCalories;
    }

    public Food(String name, String description, String calories) {
        mName = name;
        mDescription = description;
        mCalories = calories;
    }


    public static ArrayList<Food> createContactsList() {
        ArrayList<Food> contacts = new ArrayList<Food>();
        contacts.add(new Food("Lapte","200 Kcal"," 100g"));
        contacts.add(new Food("Cereale","152 Kcal"," 100g"));
        contacts.add(new Food("Cascaval","130 Kcal"," 100g"));
        contacts.add(new Food("Branza","256 Kcal"," 100g"));
        contacts.add(new Food("Salam","100 Kcal"," 100g"));
        contacts.add(new Food("Paine","101 Kcal"," 100g"));
        contacts.add(new Food("Pui","400 Kcal"," 100g"));
        contacts.add(new Food("Banane","20 Kcal"," 100g"));
        contacts.add(new Food("Suc","234 Kcal"," 100g"));
        contacts.add(new Food("Fructe","30 Kcal"," 100g"));
        contacts.add(new Food("Legume","120 Kcal"," 100g"));

        return contacts;
    }
}
