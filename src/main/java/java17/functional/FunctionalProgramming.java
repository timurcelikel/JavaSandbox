package java17.functional;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class FunctionalProgramming {

    List<String> functionalSort(final List<String> list) {
        final Comparator<String> cmp =
                (s1, s2) -> s1 == null ? -1 : s1.compareTo(s2);
        list.sort(cmp);
        return list;
    }

    List<String> naturalOrderSort(final List<String> list) {
        list.sort(Comparator.naturalOrder());
        return list;
    }

    void basicBasicConsumer() {
        final String externalData = "external data";
        final Consumer<Person> setRecord =
                p -> p.setRecord(p.getFirstName() + " " +
                        p.getLastName() + ", " + p.getAge() + ", " + externalData);

        Consumer<Person> printPersonId = p -> System.out.println(
                p.getRecord());

        Consumer<Person> setRecordThenPrint = setRecord.
                andThen(printPersonId);

        setRecordThenPrint.accept(new Person(42, "Nick", "Samoylov"));
    }
}
