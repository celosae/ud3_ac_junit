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
    
    @Test
    public void CP1_Factorial_5() {
	int n=5;
	int resultado=Factorial.calculo(n);
	int resultadoEsperado=120;
	assertEquals(resultado,resultadoEsperado);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CP2_FactorialNumeroNegativo() {
	int n=-3;
        Factorial.calculo(n);
    }

    @Test(expected = ArithmeticException.class)
    public void CP3_FactorialOverflow() {
    	int n= 30;
        Factorial.calculo(n);
    }    
}
