package guru.qa.junit;

import guru.qa.SimpleTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SimpleJunit {
    public static void main(String[] args) throws Exception{
        //Находит классы с тестами
        Method[] declaredMethod = SimpleTest.class.getDeclaredMethods();
        for (Method method : declaredMethod) {
            method.setAccessible(true);
            //Смотрит есть ли над методом @Test
            Test testAnnotation = method.getAnnotation(Test.class);
            Disabled disabled = method.getAnnotation(Disabled.class);
            if (testAnnotation != null && disabled ==null) {
                //Запускает
                try {
                method.invoke(SimpleTest.class.getDeclaredConstructor().newInstance());
            } catch (InvocationTargetException e) {
                    System.out.println("Тест упал "+ e.getCause().getMessage());
                }

    }
}


        //Если тест упал, сообщает нам
        //Если не упал, то все ок
    }
}
