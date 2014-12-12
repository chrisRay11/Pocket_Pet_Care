package com.pocketpetcare.educ8.pocketpetcare;

/**
 * Created by Grand on 12/11/2014.
 */
public class Place {

    public Place(String placeId, String placeName, double placeLat, double placeLng, String placeAddress){
        this.placeId = placeId;
        this.placeName = placeName;
        this.placeLat = placeLat;
        this.placeLng = placeLng;
        this.placeAddress = placeAddress;
    }

    private String placeId = "";
    private String placeName = "";
    private double placeLat = 0;
    private double placeLng = 0;
    private String placeAddress = "";

    public String getPlaceId() {
        return placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public double getPlaceLat() {
        return placeLat;
    }

    public double getPlaceLng() {
        return placeLng;
    }

    public String getplaceAddress() {

        return placeAddress;
    }
}
