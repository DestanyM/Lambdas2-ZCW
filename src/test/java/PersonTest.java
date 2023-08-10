import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.time.Month;
class PersonTest {

    @Test
    void getAgeTest() {
        int expected = 13;
        Person p = new Person();
        p.setBirthday(2010, Month.APRIL, 24);
        int actual = p.getAge();

        Assert.assertEquals(expected, actual);

    }

    @Test
    void getGenderFemaleTest() {
        Person.Sex expected = Person.Sex.FEMALE;
        Person p = new Person();
        p.setGender(Person.Sex.FEMALE);
        Person.Sex actual = p.getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getGenderMaleTest() {
        Person.Sex expected = Person.Sex.MALE;
        Person p = new Person();
        p.setGender(Person.Sex.MALE);
        Person.Sex actual = p.getGender();
        Assert.assertEquals(expected, actual);
    }
    @Test
    void printPersons() {
    }
}