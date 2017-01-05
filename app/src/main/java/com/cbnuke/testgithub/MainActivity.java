package com.cbnuke.testgithub;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cbnuke.testgithub.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.btnJim.setOnClickListener(this);
        binding.btnMeen.setOnClickListener(this);
        binding.btnKaew.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == binding.btnJim.getId()) {
            Intent i = new Intent(this, DetailActivity.class);
            startActivity(i);
        } else if (view.getId() == binding.btnMeen.getId()) {
            Intent i = new Intent(this, DetailActivity.class);
            startActivity(i);
        } else if (view.getId() == binding.btnKaew.getId()) {
            Intent i = new Intent(this, DetailActivity.class);
            startActivity(i);
        }
    }
}
