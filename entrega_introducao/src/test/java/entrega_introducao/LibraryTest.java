/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package entrega_introducao;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testCoverter(){
        Conversor convert = new Conversor();
        double results = convert.celsiusToFahrenheit(20);
        assertEquals(68, results, 0);
    }

    @Test public void testCoverterf() {
        Conversor convert = new Conversor();
        double result = convert.fahrenheitToCelsius(68);
        assertEquals(20, result, 0);
    }
}
