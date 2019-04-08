package com.example.assignment3;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.assignment3.fragments.Primary;

public class Menu_Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{

    Activity context;
    NavigationView navigationView;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_);

        drawerLayout=findViewById(R.id.drawer);
        ImageView hamburger=findViewById(R.id.hamburger);
        hamburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        navigationView=findViewById(R.id.nav_view);
        context=this;
        navigationView.setNavigationItemSelectedListener(this);
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
    {
        drawerLayout.closeDrawer(GravityCompat.START);
        switch(menuItem.getItemId())
        {
            case R.id.primary:
                Toast.makeText(context,"Primary",Toast.LENGTH_SHORT).show();
                Primary primary=new Primary();
                getSupportFragmentManager().beginTransaction().add(R.id.primary, primary, "Tag").commit();

                break;
            case R.id.send:
                Toast.makeText(context,"Send",Toast.LENGTH_SHORT).show();
                break;
            case R.id.contact:
                Toast.makeText(context,"Contact",Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(context,"About",Toast.LENGTH_SHORT).show();
                break;
            case R.id.help:
                Toast.makeText(context,"Help",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}
