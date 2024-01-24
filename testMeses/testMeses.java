import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class testMeses {

    @Test
    public void testNumeroMeses() {

        n4ejercicio1 lecturaMeses = new n4ejercicio1();
        ArrayList<String> monthList = lecturaMeses.getMonthList();

        assertEquals(12, monthList.size());

        assertFalse(monthList.isEmpty());

        assertEquals("agost", monthList.get(7));
    }
}