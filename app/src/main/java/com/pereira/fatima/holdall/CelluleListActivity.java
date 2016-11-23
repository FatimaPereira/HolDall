package com.pereira.fatima.holdall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CelluleListActivity extends AppCompatActivity {

    CelluleListAdapter celluleListAdapter = new CelluleListAdapter();

    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cellule_list);


       celluleListAdapter.listCellules.add(new CellulePhoto("Chat", "http://www.micetto.com/images/Chat-et-citation.jpg"));
        celluleListAdapter.listCellules.add(new CellulePhoto("Chien", "http://img.chien.com/img/races-de-chiens/47_big-chien-nu-chinois-crete.jpg"));

        celluleListAdapter.listCellules.add(new CellulePhoto("oiseau", "http://www.jgalere.com/wp-content/uploads/2014/11/ces-chiens-oiseaux-sont-les-meileures-chose-sur-internet-14-360x291.jpeg"));



        listView = (ListView) findViewById(R.id.list_cellule);
//        cellulePhoto.titre = (TextView) findViewById(R.id.row_titre_cellule);
//        cellulePhoto.sousTitre = (TextView) findViewById(R.id.row_soustitre_cellule);
//        cellulePhoto.imageView = (ImageView) findViewById(R.id.image_cellule);

        listView.setAdapter(celluleListAdapter);
        celluleListAdapter.notifyDataSetChanged();

    }
}
