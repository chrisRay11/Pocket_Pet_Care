package com.pocketpetcare.educ8.pocketpetcare;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.GoogleMapOptionsCreator;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class PetMap1 extends FragmentActivity implements GoogleMap.OnInfoWindowClickListener {

    private GoogleMap myMap; // Might be null if Google Play services APK is not available.
    private double gLongitude;
    private double gLatitude;
    private String url1 = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=";
    private int radiusValue = 1600;
    private String itemType = "pet_store";
    private String kei = "AIzaSyBEUM5KOBgsPvBQVdA5Ltn8p7DPAcK425g";


    //private EditText location,country,temperature,humidity,pressure;
    private PetMap1DataReader obj;

    private LatLng latLng;


    private String urlSetup;

    private Map<String, String> markers = new HashMap();

    /*
   *    https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=
   *         40.717859
            ,
    *        -73.9577937
            &radius=

            &types=

    &key=



    url1
    long
            lat
    distance
            type
    key
    */
    // Sets the map type to be "hybrid"
    //map.setMapType(GoogleMap.MAP_TYPE_HYBRID);





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_map1);
        setUpMapIfNeeded();
        //mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();

        //Get the current location
        LocationManager lm = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
        Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        //gLongitude = location.getLongitude();
        //gLatitude = location.getLatitude();
       // gLongitude = ;
        //gLatitude = ;






       /* if(isNetworkAvalible()){

        }*/






        //urlSetup = url1 + gLongitude + "," + gLatitude + "&radius=" + radiusValue + "&types=" + itemType + "&key=" + kei;
        urlSetup = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=42.265619,-83.15610199999998&radius=1600&types=pet_store&key=AIzaSyBEUM5KOBgsPvBQVdA5Ltn8p7DPAcK425g";


        if (myMap != null){

        }


        //sets the json





        //country.setText(obj.getCountry());
        // country.setText(obj.getCountry());
        //temperature.setText(obj.getTemperature());
        //humidity.setText(obj.getHumidity());
        //pressure.setText(obj.getPressure());
        /*
        *
        * */


        /*
            JSONObject geometry = (JSONObject) pontoReferencia.get("geometry");
            50
            JSONObject location = (JSONObject) geometry.get("location");
            51
            result.setLatitude((Double) location.get("lat"));
            52
            result.setLongitude((Double) location.get("lng"));
            53
            result.setIcon(pontoReferencia.getString("icon"));
            54
            result.setName(pontoReferencia.getString("name"));
*/



        // Other normal happenings would happen here






        GoogleMapOptions options = new GoogleMapOptions();

        //mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        options.mapType(GoogleMap.MAP_TYPE_NORMAL);
        //options.camera(CameraPosition.fromLatLngZoom())
          //      .rotateGesturesEnabled(false)
            //    .tiltGesturesEnabled(false);
        //MapFragment.newInstance(GoogleMapOptions options)



    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #myMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (myMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            myMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (myMap != null) {
                setUpMap();
                //sets the finalUrl
                String finalUrl = urlSetup;
                obj = new PetMap1DataReader(finalUrl);
                obj.fetchJSON();

                while(obj.parsingComplete){

                };
                for(Place place : obj.getplacesArray()){
                    Marker mark = myMap.addMarker(new MarkerOptions().position(new LatLng(place.getPlaceLat(), place.getPlaceLng())).title(place.getPlaceName()));
                    markers.put(mark.getId(), place.getPlaceId());
                }
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #myMap} is not null.
     */
    private void setUpMap() {
        //myMap.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker"));
        myMap.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Current Location"));

        //myMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        latLng = new LatLng(gLatitude, gLongitude);
        myMap.moveCamera(CameraUpdateFactory.zoomTo(10));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        myMap.setMyLocationEnabled(true);
        myMap.setOnInfoWindowClickListener(this);
    }

    @Override
    public void onInfoWindowClick(Marker marker) {
    //do crap on button click
    }

    /*
    public void open(View view){
        //String url = location.getText().toString();
        //String finalUrl = url1 + url;
        //country.setText(finalUrl);

        String urlSetup = url1 + gLongitude + "," + gLatitude + "&radius=" + radiusValue + "&types=" + itemType + "&key=" + kei;
        String finalUrl = urlSetup;
        obj = new PetMap1DataReader(finalUrl);
        obj.fetchJSON();

        while(obj.parsingComplete);
        //country.setText(obj.getCountry());
       // country.setText(obj.getCountry());
        //temperature.setText(obj.getTemperature());
        //humidity.setText(obj.getHumidity());
        //pressure.setText(obj.getPressure());

    }
*/

}
