package main;

public class Activity {
    private String activity;
    private double accessibility;
    private String type;
    private int participants;
    private double price;
    private int key;

    public Activity(String activity, double accessibility, String type, int participants, double price, int key) {
        this.activity = activity;
        this.accessibility = accessibility;
        this.type = type;
        this.participants = participants;
        this.price = price;
        this.key = key;
    }

    @Override
    public String toString() {
        return  "Activity: " + activity +
                " \nAccessibility: " + accessibility +
                " \nType: " + type +
                " \nParticipants: " + participants +
                " \nPrice: " + price +
                " \nKey: " + key;
    }
}
