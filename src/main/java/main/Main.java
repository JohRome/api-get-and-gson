package main;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        var boredAPI = new BoredAPI();
        var activity = boredAPI.fromJSON(boredAPI.callAPI());

        //Print information using the Activity's toString method
        System.out.println(activity);

        //Print JSON data using the toJSON method of BoredAPI
        System.out.println(boredAPI.toJSON(activity));
    }
}
