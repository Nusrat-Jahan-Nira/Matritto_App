package com.nusrat.matrittoapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;

import com.nusrat.matrittoapp.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

       // binding.text.setText("Yo");

        binding.datePredictButton.setOnClickListener(v -> {

        });

    }
}