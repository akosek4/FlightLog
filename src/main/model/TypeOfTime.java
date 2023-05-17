package main.model;

public class TypeOfTime {
    private int Dual;
    private int PIC;

    public TypeOfTime(String type, int time) {
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
