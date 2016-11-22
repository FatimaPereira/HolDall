package com.pereira.fatima.holdall;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.pereira.fatima.holdall.R.id.list;

/**
 * Created by Human Booster on 22/11/2016.
 */

public class ListAdapter extends BaseAdapter {

    //création liste de String
    ArrayList<String> listEssai = new ArrayList<>();

//    public void  setList(List<String>list) {
//     this.list = list;
//     notifyDataSetChanged();
//    }

    @Override
    public int getCount() {
        //nombre de ligne
        return listEssai.size();
    }

    @Override
    public String getItem(int i) {
        //récupérer la position dans la liste
        return listEssai.get(i);
    }

    @Override
    public long getItemId(int i) {
        //récupérer la position de ID dans la liste
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        //convert view, view recyclée
        //Si la view est nulle, on la crée
        if(convertView == null){
            convertView = LayoutInflater
                    .from(parent.getContext())
                    .inflate(R.layout.row_layout, parent, false);
        }
        //TextView textView = (TextView)convertView.findViewById(R.id.text_row);
        //textView.setText(list.get(position);
        //    OU
        ((TextView) convertView.findViewById(R.id.text_row)).setText(getItem(i));

        return convertView;
    }
}
