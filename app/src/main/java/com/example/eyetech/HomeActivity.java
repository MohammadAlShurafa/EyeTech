package com.example.eyetech;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.eyetech.Fragments.AboutFragment;
import com.example.eyetech.Fragments.AdminFragment;
import com.example.eyetech.Fragments.CallFragment;
import com.example.eyetech.Fragments.CategoriesFragment;
import com.example.eyetech.Fragments.CustomersFragment;
import com.example.eyetech.Fragments.HomeFragment;
import com.example.eyetech.Fragments.ServicesFragment;
import com.example.eyetech.Fragments.WorksFragment;
import com.google.android.material.navigation.NavigationView;

import java.util.Locale;

public class HomeActivity extends AppCompatActivity {
    Toolbar toolbar;
    DrawerLayout drawer;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    FrameLayout frameLayout;
    FragmentManager fm;
    CategoriesFragment categoriesFragment;
    Bundle bundle;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        android.content.res.Configuration conf = res.getConfiguration();
        conf.setLocale(new Locale("ar".toLowerCase()));
        res.updateConfiguration(conf, dm);

        initViews();
        initItems();

        startFragment(new HomeFragment());

        navigationView.setNavigationItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.main) {
//                Toast.makeText(this, "الرئيسية", Toast.LENGTH_SHORT).show();
                startFragment(new HomeFragment());
                closeDrawer();
            } else if (id == R.id.services) {
                startFragment(new ServicesFragment());
                closeDrawer();
            } else if (id == R.id.categories) {
                startFragment(new CategoriesFragment());
                closeDrawer();
            } else if (id == R.id.about) {
                startFragment(new AboutFragment());
                closeDrawer();
            } else if (id == R.id.customers) {
                startFragment(new CustomersFragment());
                closeDrawer();
            } else if (id == R.id.call) {
                startFragment(new CallFragment());
                closeDrawer();
            } else if (id == R.id.works) {
                startFragment(new WorksFragment());
                closeDrawer();
            } else if (id == R.id.admin) {
                startFragment(new AdminFragment());
                closeDrawer();
            }

            return true;
        });

    }

    private void initItems() {
        setSupportActionBar(toolbar);
        toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.app_name, R.string.app_name);

        drawer.addDrawerListener(toggle);
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (drawer.isDrawerOpen(GravityCompat.START)) {
//                    closeDrawer();
//                } else {
//                    drawer.openDrawer(GravityCompat.START);
//                }
//            }
//        });

//        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("عين التكنولوجيا");
//        toolbar.setTitle("الرئيسية");
        toolbar.setTitleTextColor(Color.WHITE); 
        toolbar.setNavigationIcon(R.drawable.menu_icon);
//        toolbar.setNavigationIcon(R.drawable.ic_left_arrow);


//        toggle = setupDrawerToggle();
//        toggle.setDrawerIndicatorEnabled(true);
//        toggle.syncState();

    }

    private void initViews() {
        toolbar = findViewById(R.id.toolbar_main);
        drawer = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.nav_view);
        frameLayout = findViewById(R.id.frame);
    }

/*
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.back, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.back) {
//            startFragment(new HomeFragment());
        }
/*        switch (item.getItemId()) {
            case R.id.home:
                drawer.openDrawer(GravityCompat.START);
                return true;
        }*/
/*        if (toggle.onOptionsItemSelected(item)){
            return true;
        }*/
        return super.onOptionsItemSelected(item);
    }


    private void closeDrawer() {
        drawer.closeDrawer(GravityCompat.START);
    }

    private void startFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(frameLayout.getId(), fragment, "main").commit();
    }


/*    private ActionBarDrawerToggle setupDrawerToggle() {
        return new ActionBarDrawerToggle(this, drawer, toolbar, R.string.drawer_open,  R.string.drawer_close);
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onPostCreate(savedInstanceState, persistentState);
        toggle.syncState();
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        toggle.onConfigurationChanged(newConfig);
    }*/
}