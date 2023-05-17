package test.model;

public class LocationTest {
    private String departure;
    private String arrival;

    public LocationTest(String departure, String arrival) {
        this.arrival = arrival;
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }
}
