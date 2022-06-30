package com.example.modul_1_zaniatie_3_dom_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // DOMASHKA 1.1

        int result = 0;
        for (int i = 1; i <= 45; i++){
            result = result + i;
        }
        Log.d("MYLOG", "Suma 1..45: " + result);

        // DOMASHKA 1.2

        double deposit = 1000;
        double yearPercentage = 1.05;
        double requestedMoney = 2000;
        int years = 0;

        for (int i = 0; deposit <= requestedMoney; i++){
            deposit = deposit * yearPercentage;
            years = years + 1;
        }

        Log.d("MYLOG", "Need " + years + " years to reach " + requestedMoney);
        Log.d("MYLOG", "After " + years + " years. You get: " + deposit);
    }
}