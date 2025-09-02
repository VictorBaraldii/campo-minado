package br.com.victor.cm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Teste {

    @Test
    void testarSeIgualADois() {

        int a = 1 + 1;

        assertEquals(2, a);

    }

    @Test
    void testarSeIgaualA3() {

        int x = 2 + 10 - 9;

        assertEquals(3, x);

    }

}
