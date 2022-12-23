package com.example.MusicMp3.Service_API;

public class APIService {
    private static final String base_url = "https://musicappprj.000webhostapp.com/Server/";
    public static Dataservice getService(){
        return APIRetrofitClient.getClient(base_url).create(Dataservice.class);
    }
}
