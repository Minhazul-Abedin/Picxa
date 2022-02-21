package com.niloy.picxa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.niloy.picxa.databinding.ActivityMainBinding;
import com.niloy.picxa.databinding.ActivityResultBinding;

public class Result extends AppCompatActivity {
    ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        binding.image.setImageURI(getIntent().getData());

    }
}