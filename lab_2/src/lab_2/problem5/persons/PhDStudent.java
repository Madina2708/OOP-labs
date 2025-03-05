package lab_2.problem5.persons;

import lab_2.problem5.animals.Animal;
import lab_2.problem5.animals.Dog;

public class PhDStudent extends Person {
    private String field;
    public PhDStudent(String n, int a, String f) { super(n, a); field = f; }
    @Override public String getOccupation() { return "PhD in " + field; }

    @Override
    public void assignPet(Animal p) {
        if (p instanceof Dog) {
            System.out.println(name + " is too busy for a dog!");
        } else {
            this.pet = p;
        }
    }
}
