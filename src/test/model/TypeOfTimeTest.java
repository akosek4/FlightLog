package test.model;

import main.model.TypeOfTime;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TypeOfTimeTest {
    private TypeOfTime dual = new TypeOfTime("Dual", 10.0);
    private TypeOfTime pic = new TypeOfTime("PIC", 11.0);

    @Test
    public void constructorTest() {
        assertEquals(10.0, dual.getDual());
        assertEquals(0.0, dual.getPIC());
        assertEquals(11.0, pic.getPIC());
        assertEquals(0.0, pic.getDual());
    }
}
