package lab_2.problem5;

import lab_2.problem5.persons.Person;
import java.util.ArrayList;

public class PersonRegistry {
    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person p) { people.add(p); }

    @Override
    public String toString() {
        String res = "Registry:\n";
        for (Person p : people) res += p + "\n";
        return res;
    }
}