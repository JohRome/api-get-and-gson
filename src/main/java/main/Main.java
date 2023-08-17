package main;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        var boredAPI = new BoredAPI();
        var activity = boredAPI.fromJSON(boredAPI.callAPI());

        System.out.println(activity);
    }
}
