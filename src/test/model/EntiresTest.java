package test.model;

import main.model.*;
import org.junit.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntiresTest {

    @Test
    public void constructorTest() {
        Entries test =  new Entries();
        assertEquals(0,  test.getEntries().size());
    }

    @Test
    public void addEntryDifferenceTest() {
        Entries test =  new Entries();
        Date date = new Date(2023, 5, 17);
        Date date2 = new Date(2024, 4, 14);
        Location location = new Location("SFO", "YVR");
        Location location2 = new Location("SSS", "SSS");
        TypeOfTime typeOfTime = new TypeOfTime("Dual", 1.2);
        TypeOfTime typeOfTime2 = new TypeOfTime("PIC", 1.5);
        FlightCondition condition = new FlightCondition("day", false, 1.2);
        FlightCondition condition2 = new FlightCondition("night", true, 1.5);
        Entry one = new Entry(date, "C-150", "10557", location, typeOfTime, condition,
                3, 1.2, "no comments");

        Entry two = new Entry(date2, "C-172", "1111", location2, typeOfTime2, condition2,
                5, 1.5, "comments");
        test.addEntry(one);
        assertEquals(1, test.getEntries().size());
        test.addEntry(two);
        assertEquals(2, test.getEntries().size());
        assertTrue(test.getEntries().contains(one));
        assertTrue(test.getEntries().contains(two));
    }

    @Test
    public void addEntrySameTest() {
        Entries test =  new Entries();
        Date date = new Date(2023, 5, 17);
        Location location = new Location("SFO", "YVR");
        TypeOfTime typeOfTime = new TypeOfTime("Dual", 1.2);
        FlightCondition condition = new FlightCondition("day", false, 1.2);
        Entry one = new Entry(date, "C-150", "10557", location, typeOfTime, condition,
                3, 1.2, "no comments");

        test.addEntry(one);
        assertEquals(1, test.getEntries().size());
        test.addEntry(one);
        assertEquals(2, test.getEntries().size());
        assertTrue(test.getEntries().contains(one));
    }

    @Test
    public void removeEntryNothingTest() {
        Entries test =  new Entries();
        Date date = new Date(2023, 5, 17);
        Location location = new Location("SFO", "YVR");
        TypeOfTime typeOfTime = new TypeOfTime("Dual", 1.2);
        FlightCondition condition = new FlightCondition("day", false, 1.2);
        Entry one = new Entry(date, "C-150", "10557", location, typeOfTime, condition,
                3, 1.2, "no comments");

        assertEquals(0, test.getEntries().size());
        test.removeEntry(one);
        assertEquals(0, test.getEntries().size());
    }

    @Test
    public void removeEntryContainedTest() {
        Entries test =  new Entries();
        Date date = new Date(2023, 5, 17);
        Location location = new Location("SFO", "YVR");
        TypeOfTime typeOfTime = new TypeOfTime("Dual", 1.2);
        FlightCondition condition = new FlightCondition("day", false, 1.2);
        Entry one = new Entry(date, "C-150", "10557", location, typeOfTime, condition,
                3, 1.2, "no comments");
        test.addEntry(one);

        assertEquals(1, test.getEntries().size());
        test.removeEntry(one);
        assertEquals(0, test.getEntries().size());
    }
}
