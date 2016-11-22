package com.pereira.fatima.holdall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<String>listEssai = new ArrayList<>();
        listEssai.add("essai 1");
        listEssai.add("essai 2");
        listEssai.add("essai 3");
    }
}
