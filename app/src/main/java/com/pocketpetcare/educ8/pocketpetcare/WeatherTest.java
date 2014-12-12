package com.pocketpetcare.educ8.pocketpetcare;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Grand on 12/11/2014.
 */
public class WeatherTest extends Activity{

        private String url1 = "http://api.openweathermap.org/data/2.5/weather?q=";
        private EditText location,country,temperature,humidity,pressure;
        private WeatherDataReader obj;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.weather_xml);
            location = (EditText)findViewById(R.id.editText1);
            country = (EditText)findViewById(R.id.editText2);
            temperature = (EditText)findViewById(R.id.editText3);
            humidity = (EditText)findViewById(R.id.editText4);
            pressure = (EditText)findViewById(R.id.editText5);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items
            //to the action bar if it is present.
            getMenuInflater().inflate(R.menu.wmain, menu);
            return true;
        }

        public void open(View view){
            String url = location.getText().toString();
            String finalUrl = url1 + url;
            country.setText(finalUrl);
            obj = new WeatherDataReader(finalUrl);
            obj.fetchJSON();

            while(obj.parsingComplete);
            country.setText(obj.getCountry());
            temperature.setText(obj.getTemperature());
            humidity.setText(obj.getHumidity());
            pressure.setText(obj.getPressure());

        }
    }

