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
public class TablaEnterosTest {
    
    public TablaEnterosTest() {
    }

    /**
     * Test of sumaTabla method, of class TablaEnteros.
     */
    @Test
    public void testSumaTabla() {
        System.out.println("sumaTabla");
        TablaEnteros instance = null;
        int expResult = 0;
        int result = instance.sumaTabla();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mayorTabla method, of class TablaEnteros.
     */
    @Test
    public void testMayorTabla() {
        System.out.println("mayorTabla");
        TablaEnteros instance = null;
        int expResult = 0;
        int result = instance.mayorTabla();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of posicionTabla method, of class TablaEnteros.
     */
    @Test
    public void testPosicionTabla() {
        System.out.println("posicionTabla");
        int n = 0;
        TablaEnteros instance = null;
        int expResult = 0;
        int result = instance.posicionTabla(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
