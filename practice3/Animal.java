package practice3;

public class Animal {
    String breed = "Some breed";
    int numOfLegs = 4;

    void makeSound() { System.out.println("Animal makes a sound"); }
    void eat() { System.out.println("Animal Eats"); }
    void sleep() { System.out.println("Animal sleeps ZzzZz"); }
    void eat(String food) { System.out.println("Animal eats " + food); }
}
