package test.model;

public class FlightConditionTest {
    private int Day;
    private int Night;
    private boolean CrossCountry;

    public FlightConditionTest(String time, boolean crossCountry, int duration) {
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
