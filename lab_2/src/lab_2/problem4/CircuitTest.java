package lab_2.problem4;

import lab_2.problem4.methods.Parallel;
import lab_2.problem4.methods.Series;

public class CircuitTest {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);

        double R = circuit.getResistance();
        circuit.applyPotentialDiff(12.0);

        System.out.println("Resistance: " + R);
        System.out.println("Current: " + circuit.getCurrent());
        System.out.println("Power: " + circuit.getPower());
    }
}