package edu.cs.mobile438.myapplication19nov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import edu.cs.mobile438.myapplication19nov.model.FoodItem;
import edu.cs.mobile438.myapplication19nov.model.IItemsData;
import edu.cs.mobile438.myapplication19nov.model.ItemsData;

public class MenuActivity extends AppCompatActivity {


    private Spinner spinner;
    private ListView list;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setUpViews(); // concatenate the objects of the views in runtime


        IItemsData data = new ItemsData();
        List<String> categories = data.getCategories();

        ArrayAdapter<String> adapterCats = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,categories);

        spinner.setAdapter(adapterCats);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String stingCatChosen  = spinner.getSelectedItem().toString();
                List<FoodItem> result = data.getItemsByCategory(stingCatChosen);

                // here i cant give "this" keyword to the constructor, because "this" is pointing to the current object im in
                // which is the button, so i used "MenuActivity.this" which is the current activity im in
                ArrayAdapter<FoodItem> adapterItems = new ArrayAdapter<>(MenuActivity.this,
                        android.R.layout.simple_list_item_1,result);

                list.setAdapter(adapterItems);
            }
        });
    }

    private void setUpViews(){
        spinner = findViewById(R.id.category_spinner);
        list = findViewById(R.id.itemList);
        button = findViewById(R.id.showButton);
    }


}