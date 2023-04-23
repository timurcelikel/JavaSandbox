package pluralsight.streamapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author José - Example from Pluralsight -Whats New in Java 8
 */
public class CollectorsExample {

    public static void main(String... args) {

        List<Person> persons = new ArrayList<>();

        try (
                BufferedReader reader =
                        new BufferedReader(
                                new InputStreamReader(
                                        CollectorsExample.class.getResourceAsStream("people.txt")));

                Stream<String> stream = reader.lines();
        ) {

            stream.map(line -> {
                        String[] s = line.split(" ");
                        Person p = new Person(s[0].trim(), Integer.parseInt(s[1]));
                        persons.add(p);
                        return p;
                    })
                    .forEach(System.out::println);

        } catch (IOException ioe) {
            System.out.println(ioe);
        }

        Optional<Person> opt =
                persons.stream().filter(p -> p.getAge() >= 20)
                        .min(Comparator.comparing(Person::getAge));
        System.out.println(opt);

        Optional<Person> opt2 =
                persons.stream().max(Comparator.comparing(Person::getAge));
        System.out.println(opt2);

        Map<Integer, String> map =
                persons.stream()
                        .collect(
                                Collectors.groupingBy(
                                        Person::getAge,
                                        Collectors.mapping(
                                                Person::getName,
                                                Collectors.joining(", ")
                                        )
                                )
                        );
        System.out.println(map);
    }
}
