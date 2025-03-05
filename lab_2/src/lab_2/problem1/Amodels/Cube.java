package lab_2.problem1.Amodels;

public class Cube extends Shape {
    private double side;
    public Cube(double s) { this.side = s; }
    @Override
    public double volume() {
        return Math.pow(side, 3);
    }
    @Override
    public double surfaceArea() {
        return 6 * side * side;
    }
}
