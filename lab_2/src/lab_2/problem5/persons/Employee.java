package lab_2.problem5.persons;

public class Employee extends Person {
    private String job;
    public Employee(String n, int a, String j) { super(n, a); job = j; }
    @Override public String getOccupation() { return job; }
}


