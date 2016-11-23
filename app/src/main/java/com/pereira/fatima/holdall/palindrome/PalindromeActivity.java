package com.pereira.fatima.holdall.palindrome;

import android.content.res.ColorStateList;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.pereira.fatima.holdall.R;

public class PalindromeActivity extends AppCompatActivity {


    ManagerPalindron managerPalindron = new ManagerPalindron();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome);

        final EditText editTextField = (EditText) findViewById(R.id.textfield_ok);
        editTextField.getText();
        final TextView textViewOk  = (TextView) findViewById(R.id.text_ok);
        Button textfieldBtnOk = (Button) findViewById(R.id.palindron_ok);
        final FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);



        textfieldBtnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //Toast.makeText(PalindromeActivity.this, editTextField.getText().toString(), Toast.LENGTH_LONG).show();

              textViewOk.setText(managerPalindron.reverseWord(editTextField.getText().toString()));

                boolean tarteCitron = managerPalindron.palindronWord(editTextField.getText().toString());
                if(tarteCitron) {
                    fab.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorGreen)));
                }else {
                    fab.setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorOrange)));
                }
                Log.e("rr", String.valueOf(tarteCitron));
            }
        });

//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//
//            }
//        });





    }
}
