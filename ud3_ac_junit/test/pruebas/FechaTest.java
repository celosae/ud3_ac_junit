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
public class FechaTest {
    
    public FechaTest() {
    }

    /**
     * Test of devuelveFecha method, of class Fecha.
     */
    @Test
    public void testDevuelveFecha() {
        System.out.println("devuelveFecha");
        int tipo = 0;
        Fecha instance = new Fecha();
        String expResult = "";
        String result = instance.devuelveFecha(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
