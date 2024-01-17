package lv.rvt;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
