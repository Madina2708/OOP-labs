package practice3;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("1 - Добавить Person\n2 - Добавить Student\n3 - Добавить Staff\n4 - Показать всех\n0 - Выход");
                int choice = sc.nextInt();

                if (choice == 0) break;
                else if (choice == 1) {
                    System.out.print("Имя: "); String name = sc.next();
                    System.out.print("Адрес: "); String address = sc.next();
                    people.add(new Person(name, address));
                } else if (choice == 2) {
                    System.out.print("Имя: "); String name = sc.next();
                    System.out.print("Адрес: "); String address = sc.next();
                    System.out.print("Программа: "); String program = sc.next();
                    System.out.print("Год: "); int year = sc.nextInt();
                    System.out.print("Fee: "); double fee = sc.nextDouble();
                    people.add(new Student(name, address, program, year, fee));
                } else if (choice == 3) {
                    System.out.print("Имя: "); String name = sc.next();
                    System.out.print("Адрес: "); String address = sc.next();
                    System.out.print("Школа: "); String school = sc.next();
                    System.out.print("Зарплата: "); double pay = sc.nextDouble();
                    people.add(new Staff(name, address, school, pay));
                } else if (choice == 4) {
                    for (Person p : people) System.out.println(p);
                }
            }
        }
    }
}
