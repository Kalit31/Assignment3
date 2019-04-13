package com.example.assignment3;

import android.app.Activity;
import android.app.Fragment;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.assignment3.fragments.AboutFrag;
import com.example.assignment3.fragments.ContactFragment;
import com.example.assignment3.fragments.HelpFrag;
import com.example.assignment3.fragments.Primary;
import com.example.assignment3.fragments.Send_Frag;

public class Menu_Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener
{

    Activity context;
    NavigationView navigationView;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.your_placeholder, new Primary());
        ft.commit();

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
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        switch(menuItem.getItemId())
        {
            case R.id.primary:
                Toast.makeText(context,"Primary",Toast.LENGTH_SHORT).show();
                ft.replace(R.id.your_placeholder, new Primary());
                ft.commit();

                break;
            case R.id.send:
                Toast.makeText(context,"Send",Toast.LENGTH_SHORT).show();
                ft.replace(R.id.your_placeholder, new Send_Frag());
                ft.commit();
                break;
            case R.id.contact:
                Toast.makeText(context,"Contact",Toast.LENGTH_SHORT).show();
                ft.replace(R.id.your_placeholder, new ContactFragment());
                ft.commit();
                break;
            case R.id.about:
                Toast.makeText(context,"About",Toast.LENGTH_SHORT).show();
                ft.replace(R.id.your_placeholder, new AboutFrag());
                ft.commit();
                break;
            case R.id.help:
                Toast.makeText(context,"Help",Toast.LENGTH_SHORT).show();
                ft.replace(R.id.your_placeholder, new HelpFrag());
                ft.commit();
                break;
        }
        return true;
    }


}