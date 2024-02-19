/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pruebas;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Profesor
 */
public class FactorialTest {
    
    public FactorialTest() {
    }

    /**
     * Test of calculo method, of class Factorial.
     */
    @Test
    public void testCalculo() {
        System.out.println("calculo");
        int n = 0;
        int expResult = 0;
        int result = Factorial.calculo(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
