package com.pocketpetcare.educ8.pocketpetcare;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

//import com.pocketpetcare.educ8.pocketpetcare.petsToCareForInst.PetScheduler;

import java.util.List;


public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    private String[] menuItems = { "Pet Care","Locate a Shop", "Adopt-A-Pet"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.listviewsetup, menuItems);

        ListView mainPetList = (ListView) findViewById(R.id.petMainMenuList);

        mainPetList.setAdapter(adapter);

        mainPetList.setOnItemClickListener(this);


        ///////////////////////////////
       // final ActionBar actionBar = getActionBar();

        Drawable d=getResources().getDrawable(R.drawable.pocketpatternlng);
        getActionBar().setBackgroundDrawable(d);


/*
        ActionBar bar = getActionBar();
        //bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#0000ff")));
        bar.setBackgroundDrawable(R.drawable.ic_launcher);
*/
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);



        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        switch (position) {
            case 0:

                Intent mainIntent00 = new Intent(this, PetCareInstListActivity.class);
                startActivity(mainIntent00);

                break;
            case 1:

                Intent mainIntent01 = new Intent(this, PetMap1.class);
                startActivity(mainIntent01);

                break;
            case 2:

                Intent mainIntent02 = new Intent(this, PetFinder.class);
                startActivity(mainIntent02);

                break;
            case 3:
/*
                Intent mainIntent03 = new Intent(this, PetFinder.class);
                startActivity(mainIntent03);
*/
                break;
            case 4:
/*
                Intent mainIntent04 = new Intent(this, WeatherTest.class);
                startActivity(mainIntent04);
*/
                break;
        }

    }



}
