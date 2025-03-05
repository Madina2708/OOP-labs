package lab_2.problem4.methods;

import lab_2.problem4.Circuit;

public class Parallel extends Circuit {
    private Circuit a, b;
    private double v;

    public Parallel(Circuit c1, Circuit c2) {
        a = c1; b = c2;
    }

    @Override
    public double getResistance() {
        double r1 = a.getResistance();
        double r2 = b.getResistance();
        return (r1 * r2) / (r1 + r2);
    }

    @Override
    public double getPotentialDiff() { return v; }

    @Override
    public void applyPotentialDiff(double v) {
        this.v = v;
        a.applyPotentialDiff(v);
        b.applyPotentialDiff(v);
    }
}
