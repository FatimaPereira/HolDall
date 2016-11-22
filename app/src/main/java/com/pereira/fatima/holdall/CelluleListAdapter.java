package com.pereira.fatima.holdall;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Human Booster on 22/11/2016.
 */

public class CelluleListAdapter extends BaseAdapter {

    ArrayList<CellulePhoto> listCellules = new ArrayList<>();

    @Override
    public int getCount() {
        return listCellules.size();
    }

    @Override
    public Object getItem(int i) {
        return listCellules.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        //convert view, view recyclée
        //Si la view est nulle, on la crée
        if (convertView == null) {
            convertView = LayoutInflater
                    .from(parent.getContext())
                    .inflate(R.layout.row_cellule, parent, false);
        }
       TextView titreCellule = (TextView) convertView.findViewById(R.id.row_titre_cellule);
        TextView soustitreCellule = (TextView) convertView.findViewById(R.id.row_soustitre_cellule);
        //CellulePhoto.imageView = (ImageView) convertView.findViewById(R.id.image_cellule);


       titreCellule.setText(listCellules.get(i).getTitre());
        soustitreCellule.setText(listCellules.get(i).getSousTitre());

        return convertView;
    }
}

