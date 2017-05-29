package com.example.ekta.edittext;

/**
 * Created by ekta on 29/5/17.
 */

public class Food implements Listable {
    private String mName;

    public Food(String name) {
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    @Override
    public String getLabel() {
        return mName;
    }
}
