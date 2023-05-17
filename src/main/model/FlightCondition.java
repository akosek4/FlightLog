package main.model;

public class FlightCondition {
    private double Day = 0.0;
    private double Night = 0.0;
    private boolean CrossCountry;

    public FlightCondition(String time, boolean crossCountry, double duration) {
        if (time == "night") {
            Night = duration;
        } else if (time == "day") {
            Day = duration;
        }

        CrossCountry = crossCountry;
    }

    public double getDay() {
        return Day;
    }

    public double getNight() {
        return Night;
    }

    public boolean isCrossCountry() {
        return CrossCountry;
    }
}
