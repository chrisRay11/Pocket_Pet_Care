package com.pocketpetcare.educ8.pocketpetcare;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
    private int radiusValue = 5000;
    private String itemType = "veterinary_care|pet_store&pet";
    private String kei = "AIzaSyBEUM5KOBgsPvBQVdA5Ltn8p7DPAcK425g";


    //private EditText location,country,temperature,humidity,pressure;
    private PetMap1DataReader obj;

    private LatLng latLng;


    private String urlSetup;

    private Map<String, String> markers = new HashMap();


    private String markPlace;
    private String markAddress;

    // Sets the map type to be "hybrid"
    //map.setMapType(GoogleMap.MAP_TYPE_HYBRID);





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_map1);

        Drawable d=getResources().getDrawable(R.drawable.pocketpatternlng);
        getActionBar().setBackgroundDrawable(d);

        setUpMapIfNeeded();
        //mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();

        //Get the current location
       LocationManager lm = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
       Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
       gLongitude = location.getLongitude();
       gLatitude = location.getLatitude();
       //gLongitude = -83.049838;
       //gLatitude = 42.335922;






       /* if(isNetworkAvalible()){

        }*/






        urlSetup = url1 + gLatitude + "," + gLongitude + "&radius=" + radiusValue + "&types=" + itemType + "&key=" + kei;
        //urlSetup = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=42.335922,-83.049838&radius=5000&types=pet_store&pet&key=AIzaSyBEUM5KOBgsPvBQVdA5Ltn8p7DPAcK425g";


       // if (myMap != null){

       // }


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

        }else{
            // Check if we were successful in obtaining the map.
           // if (myMap != null) {
                setUpMap();
                //sets the finalUrl
                String finalUrl = urlSetup;
                obj = new PetMap1DataReader(finalUrl);
                obj.fetchJSON();

                while(obj.parsingComplete){

                };










                for(Place place : obj.getplacesArray()){
                   // Marker mark = myMap.addMarker(new MarkerOptions().position(new LatLng(place.getPlaceLat(), place.getPlaceLng())).title(place.getPlaceName() + "\n" + place.getplaceAddress()));

                    Marker mark = myMap.addMarker(new MarkerOptions()
                            .position(new LatLng(place.getPlaceLat(), place.getPlaceLng()))
                            .title(place.getPlaceName())
                            .snippet(place.getplaceAddress())
                    );

/*




                    myMap.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() {

                        @Override
                        public View getInfoWindow(Marker arg0) {
                            return null;
                        }

                        @Override
                        public View getInfoContents(Marker marker) {

                            View v = getLayoutInflater().inflate(R.layout.markerxml, null);

                            TextView info= (TextView) v.findViewById(R.id.infoPlane);

                            info.setText(markPlace + "\n" + markAddress);

                            return v;
                        }
                    });

*/

                    // markers.put(mark.getId(), place.getPlaceId());
                   // markers.put(mark.getId(), place.getPlaceName());


                }
           // }
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
        myMap.addMarker(new MarkerOptions()
                .position(new LatLng(gLatitude, gLongitude))
                .title("Current Location")

        );

        //myMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        latLng = new LatLng(gLatitude, gLongitude);
        myMap.moveCamera(CameraUpdateFactory.zoomTo(12));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        myMap.setMyLocationEnabled(true);
        myMap.setOnInfoWindowClickListener(this);
    }

    @Override
    public void onInfoWindowClick(Marker marker) {
    //do crap on button click

        markPlace = marker.getTitle();
        markAddress = "hi";

        View v = getLayoutInflater().inflate(R.layout.markerxml, null);

        TextView info= (TextView) v.findViewById(R.id.infoPlane);

        info.setText(markPlace + "\n" + markAddress);

        //return marker;


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
