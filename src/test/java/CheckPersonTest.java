import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class CheckPersonTest extends Person {

    @Test
    void checkPersonWithLocalClass() {
        List<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(new Person("Joe Huntenburg", LocalDate.of(2010, Month.APRIL, 24),
                Person.Sex.MALE, "Joe@gmail.com"));
        listOfPeople.add(new Person("Min Jo", LocalDate.of(2023, Month.AUGUST, 8),
                Person.Sex.MALE, "bestchef@chef.com"));

        CheckPersonConcrete tester = new CheckPersonConcrete();
        Person.printPersons(listOfPeople, tester);
    }
}