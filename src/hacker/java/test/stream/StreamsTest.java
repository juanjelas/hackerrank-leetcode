package hacker.java.test.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

    public static void main(String[] args) {
        List<String> lista = Arrays.asList("hola", "buenos", "adios");
        List<String> lista2 = sort(lista);
        lista.forEach(System.out::println);
        System.out.println("--------------");
        lista2.forEach(System.out::println);
    }

    private static List<String> sort(List<String> list) {
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
