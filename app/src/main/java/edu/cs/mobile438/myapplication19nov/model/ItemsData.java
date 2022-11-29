package edu.cs.mobile438.myapplication19nov.model;

import java.util.ArrayList;
import java.util.List;


// this class is called ""mock up"" class, as im just putting fake data, not real

// the name of the class is ""ItemsData"" can be considered as i know before, is FoodItemDA form the software eng. course
public class ItemsData implements IItemsData{



    private List<FoodItem> items;


    public ItemsData(){
        items  = new ArrayList<>();
        items.add(new FoodItem("Burger1", "Burgers", 26));
        items.add(new FoodItem("Burger2", "Burgers", 26));

        items.add(new FoodItem("Drinks1", "Drinks", 36));
        items.add(new FoodItem("Sweets1", "Sweets", 22));
        items.add(new FoodItem("Burger3", "Burgers", 29));
        items.add(new FoodItem("Drinks2", "Drinks", 20));
        items.add(new FoodItem("Sweets2", "Sweets", 16));
        items.add(new FoodItem("Sweets3", "Sweets", 6));
        items.add(new FoodItem("Sweets4", "Sweets", 13));
        items.add(new FoodItem("Drinks3", "Drinks", 49));

    }


    @Override
    public List<String> getCategories() {

        List<String> categories = new ArrayList<>();
        categories.add("Burgers");

        categories.add("Drinks");
        categories.add("Sweets");

        return categories;
    }

    @Override
    public List<FoodItem> getItemsByCategory(String category) {

        List<FoodItem> result = new ArrayList<>();

        for (FoodItem item: items) {
            if (item.getCategory().equals(category)){
                result.add(item);
            }

        }

        return result;
    }
}
