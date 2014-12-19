package com.pocketpetcare.educ8.pocketpetcare;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import android.annotation.SuppressLint;
import android.widget.Toast;

public class PetMap1DataReader {
   // private String country = "county";
   // private String temperature = "temperature";
   // private String humidity = "humidity";
   // private String pressure = "pressure";
    private String urlString = null;

    private String jName;

    private ArrayList<Place> placesArray = new ArrayList<>();

    public volatile boolean parsingComplete = true;


    public PetMap1DataReader(String finalUrl){
        this.urlString = finalUrl;
    }
/*
    public String getCountry(){
        return country;
    }
    public String getTemperature(){
        return temperature;
    }
    public String getHumidity(){
        return humidity;
    }
    public String getPressure(){
        return pressure;
    }
*/

    @SuppressLint("NewApi")
    public void readAndParseJSON(String in) {
        try {
            JSONObject reader = new JSONObject(in);

            JSONArray results  = reader.getJSONArray("results");

            for(int i = 0; i < results.length(); i++){
                JSONObject result = results.getJSONObject(i);
                JSONObject geometry = result.getJSONObject("geometry");
                //JSONObject address = result.getJSONObject("vicinity");
                JSONObject location = geometry.getJSONObject("location");
                Place p = new Place(result.getString("place_id"), result.getString("name"), location.getDouble("lat"), location.getDouble("lng"), result.getString("vicinity"));
                placesArray.add(p);
            }
           // jName = results.getString("name");

            /*
            //////////////
            MarkerOptions marker = new MarkerOptions().position(new LatLng(latitude, longitude)).title("Hello Maps");

// Changing marker icon
// set yours icon here
            marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.my_marker_icon)));

// adding marker
            googleMap.addMarker(marker);
            //////////////
            */

            /*
            JSONObject main  = reader.getJSONObject("main");
            temperature = main.getString("temp");

            pressure = main.getString("pressure");
            humidity = main.getString("humidity");

            */
            parsingComplete = false;

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public void fetchJSON(){
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    URL url = new URL(urlString);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setReadTimeout(10000 /* milliseconds */);
                    conn.setConnectTimeout(15000 /* milliseconds */);
                    conn.setRequestMethod("GET");
                    conn.setDoInput(true);
                    // Starts the query
                    conn.connect();
                    InputStream stream = conn.getInputStream();

                    String data = convertStreamToString(stream);

                    readAndParseJSON(data);
                    stream.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
    static String convertStreamToString(java.io.InputStream is) {
        java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
        return s.hasNext() ? s.next() : "";
    }

    public ArrayList<Place> getplacesArray() {
        return placesArray;
    }



}