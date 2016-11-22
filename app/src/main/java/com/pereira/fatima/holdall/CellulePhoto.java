package com.pereira.fatima.holdall;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Human Booster on 22/11/2016.
 */

public class CellulePhoto {
    public static String titre;
    public static String sousTitre;
    //public static ImageView imageView;


    public static String getTitre() {
        return titre;
    }

    public static void setTitre(String titre) {
        CellulePhoto.titre = titre;
    }

    public static String getSousTitre() {
        return sousTitre;
    }

    public static void setSousTitre(String sousTitre) {
        CellulePhoto.sousTitre = sousTitre;
    }
}
