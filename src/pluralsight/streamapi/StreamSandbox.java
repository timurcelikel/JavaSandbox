package pluralsight.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamSandbox {

    public static void main(String[] args) {

        final List<String> names = List.of("Cain", "Abel", "Ezekiel", "Abraham", "Mary", "Eve");
        // Prints: Abel Abraham
        names.stream().filter(p -> p.startsWith("A")).forEach(System.out::println);

        final List<String> enames = names.stream().filter(p -> p.startsWith("E")).collect(Collectors.toList());
        // Prints: Ezekiel Eve
        enames.forEach(System.out::println);

        // Prints: {A=2, C=1, E=2, M=1}
        final Map<Character, Long> startsWith = names.stream().collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));
        System.out.println(startsWith);

        List<Person> personsEmpty = new ArrayList<>();

        // Prints: Nothing
        Optional<Person> emptyPerson = personsEmpty.stream().max(Comparator.comparing(Person::getAge));
        if (emptyPerson.isPresent()) {
            System.out.println("Oldest person is " + emptyPerson.get().getName() + " at " + emptyPerson.get().getAge() + " years old");
        } else {
            System.out.println("Nothing");
        }

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Cain", 21));
        persons.add(new Person("Abel", 21));
        persons.add(new Person("Ezekiel", 45));
        persons.add(new Person("Abraham", 76));
        persons.add(new Person("Mary", 31));
        persons.add(new Person("Eve", 18));

        // Prints: Oldest person is Abraham at 76 years old
        Optional<Person> oldestPerson = persons.stream().max(Comparator.comparing(Person::getAge));
        oldestPerson.ifPresent(person -> System.out.println("Oldest person is " + person.getName() + " at " + person.getAge() + " years old"));

        // Prints: First person in lists age: 21
        int firstPersonAge = persons.stream().findFirst().get().getAge();
        System.out.println("First person in lists age: " + firstPersonAge);

        // Prints: {18=Eve, 21=Cain, Abel, 76=Abraham, 45=Ezekiel, 31=Mary}
        Map<Integer, String> mapOfAges = persons.stream().collect(Collectors.groupingBy(
                Person::getAge, Collectors.mapping(Person::getName, Collectors.joining(", "))));
        System.out.println(mapOfAges);

        // Prints: {18=[Eve], 21=[Cain, Abel], 76=[Abraham], 45=[Ezekiel], 31=[Mary]}
        Map<Integer, List<String>> mapOfAgesAsList = persons.stream().collect(Collectors.groupingBy(
                Person::getAge, Collectors.mapping(Person::getName, Collectors.toList())));
        System.out.println(mapOfAgesAsList);

        List<Person> personsNotDistinct = new ArrayList<>();
        personsNotDistinct.add(new Person("Cain", 21));
        personsNotDistinct.add(new Person("Cain", 21));
        personsNotDistinct.add(new Person("Cain", 25));
        personsNotDistinct.add(new Person("Abel", 45));

        // Prints: Distinct names: [Cain, Abel]
        List<String> distinctNames = personsNotDistinct.stream().map(Person::getName).distinct().collect(Collectors.toList());
        System.out.println("Distinct names: " + distinctNames);

        // Prints: 21 25 45
        personsNotDistinct.stream().map(Person::getAge).distinct().forEach(System.out::println);

        // Prints: Number of distinct names in list: 2
        final List<String> distinctPersonsByName = personsNotDistinct.stream().map(Person::getName).distinct().collect(Collectors.toList());
        System.out.println("Number of distinct names in list: " + distinctPersonsByName.size());

        // Prints: Number of distinct persons in list: 3
        // Note: Interesting to note this was returning 4 prior to implementing hashCode() in Person
        final List<Person> distinctPersons = personsNotDistinct.stream().distinct().collect(Collectors.toList());
        System.out.println("Number of distinct persons in list: " + distinctPersons.size());

        // Notes:
        // flatmap just flattens an array of arrays (2 dimensional) into a single list (1 dimensional)
        // TODO: array of ints and stream with min, max, sum etc...
        // TODO: stream file.readLines() to findFirst name starting with some characters
        // TODO: stream a string into individual characters and do a toUpper.
    }
}
