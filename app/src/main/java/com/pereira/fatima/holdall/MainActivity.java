package com.pereira.fatima.holdall;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.pereira.fatima.holdall.cellule.list.CelluleListActivity;
import com.pereira.fatima.holdall.cellule.list.FullScreenCelluleActivity;
import com.pereira.fatima.holdall.palindrome.PalindromeActivity;
import com.pereira.fatima.holdall.picasso.PicassoActivity;
import com.pereira.fatima.holdall.version1.list.ListActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //cast : transformation du type(TextView)
//        TextView textView = (TextView) findViewById(R.id.text);
//        textView.setText("Bonjour");

        Button button = (Button) findViewById(R.id.test1);
        button.setOnClickListener(new View.OnClickListener() {

//          Toast message d'alerte ou pop-up
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "ça marche", Toast.LENGTH_LONG).show();
            }
        });

        //cast : transformation du type (Button)
        Button buttonPicasso = (Button) findViewById(R.id.test2);
        buttonPicasso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Envoyer vers une Activity = Intent
                Intent intent = new Intent(MainActivity.this, PicassoActivity.class);
                startActivity(intent);

            }
        });

        //cast : transformation du type (Button)
        Button buttonPalindrone = (Button) findViewById(R.id.test3);
        buttonPalindrone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Envoyer vers une Activity = Intent
                Intent intent = new Intent(MainActivity.this, PalindromeActivity.class);
                startActivity(intent);

            }
        });

        Button buttonListCellule = (Button) findViewById(R.id.test4);
        buttonListCellule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Envoyer vers une Activity = Intent
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);

            }
        });

        Button buttonList = (Button) findViewById(R.id.test5);
        buttonList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Envoyer vers une Activity = Intent
                Intent intent = new Intent(MainActivity.this, CelluleListActivity.class);
                startActivity(intent);

            }
        });



//        Button buttonEssai = (Button) findViewById(R.id.test6);
//        buttonEssai.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, FullScreenCelluleActivity.class);
//                startActivity(intent);
//
//            }
//        });

//        Button btnColorPalindrone = (Button) findViewById(R.id.fab);
//        buttonPalindrone.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // Envoyer vers une Activity = Intent
//                Intent intent = new Intent(MainActivity.this, PalindromeActivity.class);
//                startActivity(intent);
//
//            }
//        });

    }

    @Override
    protected void onStart() {
        super.onStart();

    }

}


