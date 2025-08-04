import org.junit.Test;

import static org.junit.Assert.*;

public class CALCULATORTest {

    @Test
    public void add() {
        CALCULATOR calc = new CALCULATOR();
        assertEquals(5, calc.add(2, 3));
    }
}