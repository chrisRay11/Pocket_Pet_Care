package com.pocketpetcare.educ8.pocketpetcare;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.pocketpetcare.educ8.pocketpetcare.petsToCareForInst.PetScheduler;

import java.util.List;


public class MainActivity extends Activity implements AdapterView.OnItemClickListener {

    private String[] menuItems = { "Pet Care", "Select a Pet","Locate a Shop", "Pet Scheduler", "XX2" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, menuItems);

        ListView mainPetList = (ListView) findViewById(R.id.petMainMenuList);

        mainPetList.setAdapter(adapter);

        mainPetList.setOnItemClickListener(this);





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
                Toast.makeText(this, "search Intent00 to change the intent path for Pet Care: " , Toast.LENGTH_SHORT).show();

                Intent mainIntent00 = new Intent(this, PetCareInstListActivity.class);
                startActivity(mainIntent00);

                break;
            case 1:
                Toast.makeText(this, "search Intent01 to change the intent path for Select a Pet: " , Toast.LENGTH_SHORT).show();
/*
                Intent mainIntent01 = new Intent(this, INSERTINTENDEDCLASSHERE.class);
                startActivity(mainIntent01);
*/
                break;
            case 2:
                Toast.makeText(this, "search Intent02 to change the intent path for Locate a Shop: " , Toast.LENGTH_SHORT).show();

                Intent mainIntent02 = new Intent(this, PetMap1.class);
                startActivity(mainIntent02);

                break;
            case 3:
                Toast.makeText(this, "search Intent03 to change the intent path for Pet Scheduler: " , Toast.LENGTH_SHORT).show();

                Intent mainIntent03 = new Intent(this, PetScheduler.class);
                startActivity(mainIntent03);

                break;
            case 4:
                Toast.makeText(this, "search Intent04 to change the intent path for XX2: " , Toast.LENGTH_SHORT).show();

                Intent mainIntent04 = new Intent(this, WeatherTest.class);
                startActivity(mainIntent04);

                break;
        }

    }



}
