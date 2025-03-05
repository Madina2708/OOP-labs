package lab_2.problem4.methods;

import lab_2.problem4.Circuit;

public class Series extends Circuit {
    private Circuit a, b;
    private double v;

    public Series(Circuit c1, Circuit c2) {
        a = c1; b = c2;
    }

    @Override
    public double getResistance() { return a.getResistance() + b.getResistance(); }

    @Override
    public double getPotentialDiff() { return v; }

    @Override
    public void applyPotentialDiff(double v) {
        this.v = v;
        double current = v / getResistance();
        a.applyPotentialDiff(current * a.getResistance());
        b.applyPotentialDiff(current * b.getResistance());
    }
}
