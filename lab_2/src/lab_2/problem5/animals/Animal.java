package lab_2.problem5.animals;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String n, int a) { name = n; age = a; }
    public abstract String getSound();
    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() { return name + " (" + getSound() + ")"; }
}




