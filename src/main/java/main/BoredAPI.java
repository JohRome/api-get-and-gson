package main;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
public class BoredAPI {

    //Source: https://www.boredapi.com/documentation
    private final String spec = "http://www.boredapi.com/api/activity/";

    public String callAPI() throws IOException {
        //Create a URL object and pass the spec to parameter
        URL url = new URL(spec);

        //Store the response in a StringBuilder object
        StringBuilder strResp = new StringBuilder();

        //Read the data from the URL
        Scanner scan = new Scanner(url.openStream());

        //Read data from API and store it in the strResp
        while(scan.hasNext())
            strResp.append(scan.nextLine());

        //Closing the connection
        scan.close();

        //Returning the response as a String, so it can be passed to the method below
        return strResp.toString();
    }

    public Activity fromJSON(String jsonResp) {
        //Create a gson object
        Gson gson = new Gson();

        //Deserialize a jsonResp into the Activity Java class
        return gson.fromJson(jsonResp, Activity.class);
    }
}
