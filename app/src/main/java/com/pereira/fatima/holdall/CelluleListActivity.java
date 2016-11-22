package com.pereira.fatima.holdall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class CelluleListActivity extends AppCompatActivity {

    CelluleListAdapter celluleListAdapter = new CelluleListAdapter();
    //CellulePhoto cellulePhoto = new CellulePhoto();
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cellule_list);

        celluleListAdapter.listCellules.add("titre");
        celluleListAdapter.listCellules.add("essai 1");
        celluleListAdapter.listCellules.add("essai 1");

        listView = (ListView) findViewById(R.id.list_cellule);
//        cellulePhoto.titre = (TextView) findViewById(R.id.row_titre_cellule);
//        cellulePhoto.sousTitre = (TextView) findViewById(R.id.row_soustitre_cellule);
//        cellulePhoto.imageView = (ImageView) findViewById(R.id.image_cellule);

        listView.setAdapter(celluleListAdapter);

    }
}
