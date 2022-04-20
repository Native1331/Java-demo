package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    @DisplayName("Класс с демонстрационным тестом")
    public class simpleTest {

        @Disabled("CodeTools - 7901636")//можно весь класс
        @DisplayName("Демонстрационный тест")
        @Test
        void firstTest() {
            Assertions.assertTrue(3 > 2);
            Assertions.assertFalse(3 < 2);
            Assertions.assertEquals("Foo", "Foo");
//            Assertions.assertAll(
            //                  Assertions.assertTrue(3>2);
            //                  Assertions.assertFalse(3<2);

        }
    }
    @DisplayName("Демонстрационный тест №2")
    @Test
    void secondTest() {
        //Вот тут проверим...
        Assertions.assertTrue(3>2);
    }
}

