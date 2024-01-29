import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class testMeses {

        n4ejercicio1 lecturaMeses = new n4ejercicio1();
        ArrayList<String> monthList = lecturaMeses.getMonthList();
    
    @Test
    public void Testsize() {

        assertEquals(12, monthList.size(), "hay 12 posiciones");
    }
    @Test
    public void testElementvoid () {
        assertNotEquals(0, monthList.size(), "Comprobar que no hay 0 elementos");

    }
    @Test
    public void testAgost(){
        assertEquals(monthList.get(7), "agost","Comprobar que agost está en la posición correcta");


    }
 
}
