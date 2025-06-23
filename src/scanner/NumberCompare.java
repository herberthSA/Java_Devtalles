package scanner;

import java.util.ArrayList;
import java.util.List;

public class NumberCompare {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lucas");
        list.add("Juan");
        list.add("Herberth");
        list.add("Pedro");
        list.add("Monica");

        List<String> a = list.stream()
                .map(String::toUpperCase)
                .map(nombre -> nombre.replace("E", "3")) // ejemplo de transformación
                .toList();

        a.forEach(System.out::println);
    }
}
