package lab_2.problem5;

import lab_2.problem5.animals.Animal;
import lab_2.problem5.animals.Cat;
import lab_2.problem5.animals.Dog;
import lab_2.problem5.persons.Employee;
import lab_2.problem5.persons.Person;
import lab_2.problem5.persons.PhDStudent;

public class PetTest {
    public static void main(String[] args) {
        Person bekzat = new Employee("Bekzat", 30, "Engineer");
        Person kanat = new PhDStudent("Kanat", 26, "Computer Science");

        Animal barsik = new Cat("Barsik", 3);
        Animal aktos = new Dog("Aktos", 2);

        PersonRegistry reg = new PersonRegistry();
        reg.addPerson(bekzat);
        reg.addPerson(kanat);

        bekzat.assignPet(barsik);
        System.out.println("Status 1:\n" + reg);

        bekzat.leavePetWith(kanat);
        System.out.println("Status 2 (Vacation):\n" + reg);

        bekzat.retrievePetFrom(kanat);
        System.out.println("Status 3 (Returned):\n" + reg);

        System.out.println("Testing PhD restriction:");
        kanat.assignPet(aktos);
    }
}
