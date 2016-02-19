package com.example.thait.quiz;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    private static int points = 0;
    Button bn;
    public static void success(double point){
        points += point;
    }
    public static double getPoints(){
        return points;
    }

    public void next(View view) {
        Intent intent = new Intent(this, Q1.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        bn = (Button) findViewById(R.id.button);
//        bn.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                FragmentManager fragmentManager = getFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//                FragQ1 frag1 = new FragQ1();
//
//                fragmentManager.add(R.id.fragment_container,frag1);
//                fragmentTransaction.commit();
//                FragQ2 frag2 = new FragQ2();
//                fragmentManager.add(R.id.fragment_container,frag2);
//
//
//            }
//
//        });
    }

}
