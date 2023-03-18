package com.photon.demo.weatherApp.util;


import static com.photon.demo.weatherApp.util.Constants.COUNTRY_CODE_US;

public class URLUtils {
    private final String link;
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather?";
    private static String city_url;

    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    //https://api.openweathermap.org/data/2.5/weather?lat=44.34&amp;lon=10.99&amp;appid={

    /// https://api.openweathermap.org/data/2.5/weather?q={city name}&amp;appid={API

    public URLUtils() {
        link = BASE_URL + "lat=" + LocationCord.lat + "&lon=" +
                LocationCord.lon + "&appid=" + Constants.API_KEY;
    }

    public String getLink() {
        return link;
    }


    /* Showing only US cities by adding "US" code statically in Url.
    Due to this only US cities with name and zipcode can be found */
    public static void setCity_url(String cityName) {
        city_url = BASE_URL + "&q=" + cityName + "," + COUNTRY_CODE_US + "&appid=" + Constants.API_KEY + "&units=" + Constants.UNITS;
    }

    public static String getCity_url() {
        return city_url;
    }

}
