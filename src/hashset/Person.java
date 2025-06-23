package hashset;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {
    private String name;
    private String dni;

    public Person(String name, String dni) {
        this.name = name;
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(dni, person.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
        Person person1 = new Person("Maria","123");
        Person person2 = new Person("Maria","123");
        Person person3 = new Person("Juan","523");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        for (Person person: persons){
            System.out.println(person.name);
        }
    }
}
