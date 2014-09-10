import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class PrimeFactorsTest {
    @Test
    public void shouldBeEmptyForOne() throws Exception {
        checkResult(1);
    }

    @Test
    public void factorAPrimeNumber() throws Exception {
        checkResult(89, 89);
    }

    @Test
    public void factor36() throws Exception {
        checkResult(36, 2, 2, 3, 3);
    }

    @Test
    public void factor1024() throws Exception {
        checkResult(1024, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2);
    }

    @Test
    public void factorProjectEulerExample() throws Exception {
        checkResult(600851475143L, 71, 839, 1471, 6857);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void doesNotAllowRemove() {
        PrimeFactors primeFactors = new PrimeFactors(33);
        final Iterator<Long> iterator = primeFactors.iterator();
        iterator.remove();
    }

    private void checkResult(long target, Integer... expected) {
        int count = 0;
        PrimeFactors primeFactors = new PrimeFactors(target);
        final Iterator<Long> iterator = primeFactors.iterator();

        for (Integer i : expected) {
            final String message = "factor[" + ++count + "] should be " + i;
            assertTrue(message + " but iterator was empty", iterator.hasNext());
            assertEquals(message, ((long) i), iterator.next().longValue());
        }
        assertFalse(iterator.hasNext());
    }
}
