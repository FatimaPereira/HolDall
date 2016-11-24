package com.pereira.fatima.holdall.cellule.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.pereira.fatima.holdall.R;
import com.squareup.picasso.Picasso;

public class FullScreenCelluleActivity extends AppCompatActivity {

    TextView titreFullscreen;
    TextView urlFullscreen;
    ImageView imageFullscreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_cellule);

        String title = getIntent().getStringExtra("Title");
        String url = getIntent().getStringExtra("Url");

        titreFullscreen = (TextView) findViewById(R.id.titre_fullscreen);
        titreFullscreen.setText(title);
        urlFullscreen = (TextView) findViewById(R.id.url_fullscreen);
        urlFullscreen.setText(url);
        imageFullscreen = (ImageView) findViewById(R.id.image_fullscreen);
        Picasso.with(this).load(url).into(imageFullscreen);


    }
}
