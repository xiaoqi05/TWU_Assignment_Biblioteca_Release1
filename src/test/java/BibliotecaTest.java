import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {
    private Biblioteca biblioteca;

    @Before
    public void setUp() {
        biblioteca = new Biblioteca();
    }


    @Test
    public void shouldReturnRightList() throws Exception {
        String helloWorld = biblioteca.helloWorld();
        assertEquals("hello world", helloWorld);
    }
}
