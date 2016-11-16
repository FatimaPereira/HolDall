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


        // Mettre l'image dans une string'
        String url = "http://cache.20minutes.fr/photos/2014/11/19/mandatory-credit-photo-by-geoffrey-208f-diaporama.jpg";
        // On récupére l'image pour l'afficher
        ImageView imageView = (ImageView) findViewById(R.id.image_picasso);

        // A retrouver sur le site Picasso
        Picasso.with(this).load(url).into(imageView);


    }
}
