package edu.cs.mobile438.myapplication19nov.model;

import java.util.List;


// by convention, in the naming of an interface, the first letter in is is "I"
public interface IItemsData {

    List<String> getCategories(); // to be put inside the spinner at runtime.

    List<FoodItem> getItemsByCategory(String category); // return all the items of a specific category
}
