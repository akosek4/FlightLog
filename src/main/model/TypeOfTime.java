package main.model;

public class TypeOfTime {
    private double Dual = 0.0;
    private double PIC = 0.0;

    public TypeOfTime(String type, double time) {
        if (type == "Dual") {
            Dual = time;
        } else if (type == "PIC") {
            PIC = time;
        }
    }

    public double getDual() {
        return Dual;
    }

    public double getPIC() {
        return PIC;
    }
}
