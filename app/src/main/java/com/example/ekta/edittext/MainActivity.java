package com.example.ekta.edittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ClickToSelectEditText<Food> editTextJobCategory = (ClickToSelectEditText<Food>) findViewById(R.id.food_select);
        ArrayList<Food> foods = new ArrayList<>(Arrays.asList(new Food("pizza"), new Food
                ("Burger")));
        editTextJobCategory.setItems(foods);
        editTextJobCategory.setOnItemSelectedListener(new ClickToSelectEditText
                .OnItemSelectedListener<Food>() {
            @Override
            public void onItemSelectedListener(Food item, int selectedIndex) {

            }
        });
    }
}
