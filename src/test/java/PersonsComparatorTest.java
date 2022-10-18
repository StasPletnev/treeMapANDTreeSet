import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

@DisplayName("Тестирование класса PersonsComparator")
public class PersonsComparatorTest {
    private PersonsComparator personsComparator;

    @BeforeEach
    void setUp(){
        personsComparator = new PersonsComparator(10);
    }

    @Test
    @DisplayName("Проверка компаратора")
    void testCompare() {
        Assertions.assertEquals(-1, personsComparator.compare(new Person("Stas", "Pletnev", 21), new Person("Sasha", "Pavlov", 20)));
    }

}
