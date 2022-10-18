import org.junit.jupiter.api.*;

@DisplayName("Тестирование класса Person")
public class PersonTest {
    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Stas", "Pletnev", 21);
    }

    @Test
    @DisplayName("Тестирование getName у класса Person")
    void getName(){
        Assertions.assertEquals("Stas", person.getName());
    }

    @Test
    @DisplayName("Тестирование getSurname у класса Person")
    void getSurname(){
        Assertions.assertEquals("Pletnev", person.getSurname());
    }

    @Test
    @DisplayName("Тестирование getAge у класса Person")
    void getAge(){
        Assertions.assertEquals(21, person.getAge());
    }

    @Test
    @DisplayName("Тест toString у класса Person")
    void getToString(){
        Assertions.assertEquals("Stas Pletnev 21", person.toString());
    }


}
