package lv.rvt;

import static org.junit.Assert.*;

import org.junit.Test;

import rvt.Money;

public class MoneyTest {
    @Test
    public void testPlusMethod(){
        Money macins1 = new Money(10, 10);
        Money macins2 = new Money(6, 90);
        Money macins3 = macins1.plus(macins2);

        assertEquals(16, macins3.euros());
        assertEquals(100, macins3.cents());
    }

    @Test
    public void testMinusMethod() {
        Money macins1 = new Money(21, 90);
        Money macins2 = new Money(10, 8);
        Money macins3 = macins1.minus(macins2);

        assertEquals(11, macins3.euros());
        assertEquals(82, macins3.cents());
    }

    @Test
    public void testLessThan() {
        Money macins1 = new Money(21, 90);
        Money macins2 = new Money(30, 8);
        Money macins3 = new Money(23, 67);

        boolean result1 = macins1.lessThan(macins2);
        boolean result2 = macins3.lessThan(macins1);

        assertTrue(result1);
        assertFalse(result2);
    }
}
