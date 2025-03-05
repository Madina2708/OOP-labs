package lab_2.problem5.persons;

import lab_2.problem5.animals.Animal;

import java.util.Objects;

public abstract class Person {
    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String n, int a) { name = n; age = a; }

    public void assignPet(Animal p) { this.pet = p; }
    public void removePet() { this.pet = null; }
    public abstract String getOccupation();

    public void leavePetWith(Person friend) {
        if (this.pet != null) {
            friend.assignPet(this.pet);
            this.removePet();
        }
    }

    public void retrievePetFrom(Person friend) {
        if (friend.pet != null) {
            this.assignPet(friend.pet);
            friend.removePet();
        }
    }

    @Override
    public String toString() {
        return name + " [" + getOccupation() + "], Pet: " + (pet == null ? "None" : pet);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
