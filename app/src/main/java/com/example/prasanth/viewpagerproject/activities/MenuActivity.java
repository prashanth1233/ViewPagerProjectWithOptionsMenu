package com.example.prasanth.viewpagerproject.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.prasanth.viewpagerproject.R;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem)
    {
        switch (menuItem.getItemId())
        {
            case R.id.viewPager:
                Intent intent=new Intent(this,MainActivity.class);
                startActivity(intent);
                return true;
            case R.id.home:
                Toast.makeText(this,"NO DATA AVAILABLE",Toast.LENGTH_LONG).show();
                return true;
            case R.id.settings:
                Toast.makeText(this,"NO SETTINGS AVAILABLE",Toast.LENGTH_LONG).show();
                return true;
        }
        return true;
    }
}
