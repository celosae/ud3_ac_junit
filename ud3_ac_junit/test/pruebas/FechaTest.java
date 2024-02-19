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

Fecha fecha = new Fecha();

	@Test
	public void CP1_FormatoFecha1() {
		String orden = "\\d{4}/\\d{2}";
		int n = 1;
		String resultado = fecha.devuelveFecha(n);
		assertTrue(resultado.matches(orden));

	}
	@Test
	public void CP2_FormatoFecha2() {
		String orden = "\\d{2}/\\d{4}";
		int n = 2;
		String resultado = fecha.devuelveFecha(n);
		assertTrue(resultado.matches(orden));

	}
	@Test
	public void CP3_FormatoFecha3() {
		String orden = "\\d{2}/\\d{2}";
		int n = 3;
		String resultado = fecha.devuelveFecha(n);
		assertTrue(resultado.matches(orden));

	}
	@Test
	public void CP4_FormatoFechaError() {
		String orden = "ERROR";
		int n = 4;
		String resultado = fecha.devuelveFecha(n);
		assertTrue(resultado.matches(orden));

	}    
        
}
