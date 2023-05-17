package main.model;

public class FlightCondition {
    private int Day;
    private int Night;
    private boolean CrossCountry;

    public FlightCondition(String time, boolean crossCountry, int duration) {
        if (time == "night") {
            Night = duration;
        } else if (time == "day") {
            Day = duration;
        }

        CrossCountry = crossCountry;
    }

    public int getDay() {
        return Day;
    }

    public int getNight() {
        return Night;
    }

    public boolean isCrossCountry() {
        return CrossCountry;
    }
}
