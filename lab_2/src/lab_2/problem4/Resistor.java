package lab_2.problem4;

public class Resistor extends Circuit {
    private double r;
    private double v;

    public Resistor(double res) { r = res; }

    @Override
    public double getResistance() { return r; }

    @Override
    public double getPotentialDiff() { return v; }

    @Override
    public void applyPotentialDiff(double v) { this.v = v; }
}
