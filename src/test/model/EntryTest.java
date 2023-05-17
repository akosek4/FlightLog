package test.model;

import main.model.Entry;
import main.model.FlightCondition;
import main.model.Location;
import main.model.TypeOfTime;
import org.junit.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntryTest {
    private Date date = new Date(2023, 5, 17);
    private Location location = new Location("SFO", "YVR");
    private TypeOfTime typeOfTime = new TypeOfTime("Dual", 1.2);
    private FlightCondition condition = new FlightCondition("day", false, 1.2);
    private Entry entry = new Entry(date, "C-150", "10557", location, typeOfTime, condition,
            3, 1.2, "no comments");

    @Test
    public void constructorTest() {
        assertEquals(date, entry.getDate());
        assertEquals("C-150", entry.getMakeAndModel());
        assertEquals("10557", entry.getIdentity());
        assertEquals(location, entry.getLocation());
        assertEquals(typeOfTime, entry.getTypeOfTime());
        assertEquals(condition, entry.getCondition());
        assertEquals(3, entry.getLandings());
        assertEquals(1.2, entry.getTotalDuration());
        assertEquals("no comments", entry.getComments());
    }


    @Test
    public void setDateTest() {
        Date nd = new Date(2023, 5, 18);
        entry.setDate(nd);
        assertEquals(nd, entry.getDate());
    }

    @Test
    public void setMakeAndModelTest() {
        entry.setMakeAndModel("C-172");
        assertEquals("C-172", entry.getMakeAndModel());
    }

    @Test
    public void setIdentityTest() {
        entry.setIdentity("11111");
        assertEquals("11111", entry.getIdentity());
    }

    @Test
    public void setLocationTest() {
        Location l = new Location("SSS", "HHHH");
        entry.setLocation(l);
        assertEquals(l, entry.getLocation());
    }

    @Test
    public void setTypeOfTimeTest() {
        TypeOfTime l = new TypeOfTime("Dual",111.0 );
        entry.setTypeOfTime(l);
        assertEquals(l, entry.getTypeOfTime());
    }

    @Test
    public void setConditionTest() {
        FlightCondition l = new FlightCondition("night",true, 1.5);
        entry.setCondition(l);
        assertEquals(l, entry.getCondition());
    }

    @Test
    public void setLandingsTest() {
        entry.setLandings(10);
        assertEquals(10, entry.getLandings());
    }

    @Test
    public void setTotalDurationTest() {
        entry.setTotalDuration(1.5);
        assertEquals(1.5, entry.getTotalDuration());
    }

    @Test
    public void setCommentsTest() {
        entry.setComments("hh");
        assertEquals("hh", entry.getComments());
    }
}
