package com.example.thait.quiz;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    private static int points = 0;
    public static void addPoint(double point){
        points += point;
    }
    public static double getPoints(){
        return points;
    }

    public static void resetPoints(){
        points = 0;
    }
    public void next(View view) {
        Intent intent = new Intent(this, Q1.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
