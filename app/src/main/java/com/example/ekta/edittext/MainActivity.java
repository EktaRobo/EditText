package com.example.ekta.edittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;

public class MainActivity extends AppCompatActivity {

    public static final String PREFIX_9_1 = "+91 ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final AppCompatEditText edt = (AppCompatEditText) findViewById(R.id.mobile);

        edt.setText(PREFIX_9_1);
        Selection.setSelection(edt.getText(), edt.getText().length());


        edt.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(!s.toString().contains(PREFIX_9_1)){
                    edt.setText(PREFIX_9_1);
                    Selection.setSelection(edt.getText(), edt.getText().length());

                }

            }
        });
    }
}
