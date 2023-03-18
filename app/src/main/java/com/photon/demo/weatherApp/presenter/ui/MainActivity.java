package com.photon.demo.weatherApp.presenter.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.photon.demo.weatherApp.R;
import com.photon.demo.weatherApp.util.AppUtils;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // set navigation bar color
        AppUtils.setNavigationBarColor(this);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().
                    setReorderingAllowed(true).add(R.id.fragment_container_view,
                            MainFragment.class, null).commit();
        }

    }
}