package test.model;

public class TypeOfTimeTest {
    private int Dual;
    private int PIC;

    public TypeOfTimeTest(String type, int time) {
        if (type == "Dual") {
            Dual = time;
        } else if (type == "PIC") {
            PIC = time;
        }
    }

    public int getDual() {
        return Dual;
    }

    public int getPIC() {
        return PIC;
    }
}
