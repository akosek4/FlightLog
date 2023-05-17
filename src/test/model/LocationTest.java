package test.model;

import main.model.Location;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LocationTest {
    private Location location = new Location("YVR", "SFO");

    @Test
    public void ConstructorTest() {
        assertEquals("SFO", location.getArrival());
        assertEquals("YVR", location.getDeparture());
    }

    @Test
    public void setArrivalTest() {
        location.setArrival("YVR");
        assertEquals("YVR", location.getArrival());
    }

    @Test
    public void setDepartureTest() {
        location.setDeparture("SFO");
        assertEquals("SFO", location.getDeparture());
    }
}
