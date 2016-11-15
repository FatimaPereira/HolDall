package com.pereira.fatima.holdall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicassoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picasso);

        String url ="http://humourtop.com/images-insolites-droles-5/Avion_Afrique_insolite.jpg";
        ImageView imageView = (ImageView) findViewById(R.id.image_picasso);

        Picasso.with(this).load(url).into(imageView);



    }
}
