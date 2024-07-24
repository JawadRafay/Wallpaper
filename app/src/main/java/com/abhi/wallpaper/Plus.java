package com.abhi.wallpaper;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Plus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.plus);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.plus);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.home) {
                    Intent intent1 = new Intent(getApplicationContext(), Home.class);
                    startActivity(intent1);
                    overridePendingTransition(0, 0);
                    return true;
                } else if (itemId == R.id.explore) {
                    Intent intent = new Intent(getApplicationContext(), Explore.class);
                    startActivity(intent);
                    overridePendingTransition(0, 0);
                    return true;
                } else if (itemId == R.id.plus) {
                    return true;
                } else if (itemId == R.id.profile) {
                    Intent intent2 = new Intent(getApplicationContext(), Profile.class);
                    startActivity(intent2);
                    overridePendingTransition(0, 0);
                    return true;
                }


                return false;
            }
        });

    }
}