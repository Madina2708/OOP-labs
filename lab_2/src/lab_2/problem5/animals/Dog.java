package lab_2.problem5.animals;

public class Dog extends Animal {
    public Dog(String n, int a) { super(n, a); }
    @Override public String getSound() { return "Woof"; }
}
