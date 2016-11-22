package com.pereira.fatima.holdall;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.R.id.list;

public class ListActivity extends AppCompatActivity {

    ListAdapter listAdapter = new ListAdapter();

    // .from(parent.getContext()) dans la Class ListAdapter SI .from(context)
    // private Context context;
    //CONSTRUCTEUR
//    public ListAdapter(Context context){
//        this.context = context;
//    }

// CREER un Setter pour la liste
//    public void setListAdapter(ListAdapter listAdapter) {
//        this.listAdapter = listAdapter;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listAdapter.listEssai.add("essai 1");
        listAdapter.listEssai.add("essai 2");
        listAdapter.listEssai.add("essai 3");

        //j'ai fait la liste
//      ListAdapter myListAdapter = new ListAdapter(this);
//      listAdapter.setList(list);


        // création de l'adapteur
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(listAdapter);
        // Pour changer automatiquement si mAJ de la liste
        listAdapter.notifyDataSetChanged();
    }


}
