package com.example.recyclerview1.datas;

import com.example.recyclerview1.R;
import com.example.recyclerview1.models.Food;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FoodData {
    private static String [] foodName = {
            "Ayam Geprek",
            "Ayam kecap",
            "Ayam panggang madu",

    };

    private static String [] foodPrice = {
            "15000",
            "20000",
            "25000",

    };

    private static int [] foodImage = {
            R.drawable.geprek,
            R.drawable.kecap,
            R.drawable.panggang,


    };

    public static ArrayList<Food> getDataFood() {
        ArrayList<Food> list = new ArrayList<>();
        for(int i=0;i<foodName.length;i++){
            Food food = new Food(foodName[i],"Rp " + foodPrice[i], foodImage[i]);
            list.add(food);
        }
        return list;
    }
}
