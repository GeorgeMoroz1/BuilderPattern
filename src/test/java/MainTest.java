import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MainTest {
Person person = new PersonBuilder().setName("Юрий").setSurname("Морозов").setAge(32).setAddress("Санкт-Петербург").build();
    @BeforeEach
    public void beforeTest() {
        System.out.println("Подготовка к тесту");
    }

    @Test
    public void noName() {
        Assertions.assertNotNull(person.name);
    }
    @Test
    public void noSurname() {
        Assertions.assertNotNull(person.surname);
    }
    @Test
    public void ageTest() {
        Assertions.assertTrue(person.hasAge());
        Assertions.assertFalse(person.getAge()>=-100 && person.getAge() < 0);
    }

    @Test
    public void ChildTest() {
        Person person = new PersonBuilder().setName("Юрий").setSurname("Морозов").setAge(32).setAddress("Санкт-Петербург").build();
        Person son = person.newChildBuilder().setName("Иван").setSurname("Морозов").setAge(11).setAddress("Санкт-Петербург").build();
        Assertions.assertEquals(person.getSurname(), son.getSurname());
        Assertions.assertEquals(person.getAddress(), son.getAddress());
    }
    @AfterEach
    public void afterTest() {
        System.out.println("Тест завершён");
    }
}