package Tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static java.lang.System.out;

public class TestForTest {


    @AfterEach
    public void PeroniAfterEach(){
        out.println("Бля ПЕРЕД");
    }


    @BeforeEach
    public void PeroniEach(){
        out.println("Бля послее");
    }

    @Test
    public void Perni(){
        out.println("Проверка");
    }
}
