package com.pereira.fatima.holdall.cellule.list;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Human Booster on 22/11/2016.
 */

public class CellulePhoto {
    public String titre;
    public String url;
    //public static ImageView imageView;


    public CellulePhoto(String titre, String url) {
        this.titre = titre;
        this.url = url;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
