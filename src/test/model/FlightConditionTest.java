package test.model;

import main.model.FlightCondition;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightConditionTest {
    private FlightCondition day = new FlightCondition("day", false, 11.1);
    private FlightCondition nightAndCC = new FlightCondition("night", true, 10.1);

    @Test
    public void constructorTest() {
        assertEquals(11.1, day.getDay());
        assertEquals(0.0, day.getNight());
        assertEquals(false, day.isCrossCountry());
        assertEquals(10.1, nightAndCC.getNight());
        assertEquals(0.0, nightAndCC.getDay());
        assertEquals(true, nightAndCC.isCrossCountry());
    }
}
