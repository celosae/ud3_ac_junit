/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package pruebas;

import java.util.NoSuchElementException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Profesor
 */
public class TablaEnterosTest {
    
    public TablaEnterosTest() {
    }

    	@Test
	public void CP_sumaTabla() {
		Integer[] tabla = { 1, 2, 3, 4, 5 };
		TablaEnteros t = new TablaEnteros(tabla);
		int resultado = t.sumaTabla();
		int resultadoEsperado = 15;
		assertEquals(resultadoEsperado, resultado);
	}

	@Test
	public void CP_MayorTabla() {
		Integer[] tabla = { 1, 7, 3, 9, 5 };
		TablaEnteros t = new TablaEnteros(tabla);
		int resultado = t.mayorTabla();
		int resultadoEsperado = 9;
		assertEquals(resultadoEsperado, resultado);
	}

	@Test
	public void CP_PosicionTabla() {
		Integer[] tabla = { 1, 2, 3, 4, 5 };
		TablaEnteros t = new TablaEnteros(tabla);
		int resultado = t.posicionTabla(2);
		int resultadoEsperado = 1;
		assertEquals(resultadoEsperado, resultado);
	}

	@Test(expected = NoSuchElementException.class)
	public void CP_PosicionTablaNoExiste() {
		Integer[] tabla = { 1, 2, 3, 4, 5 };
		TablaEnteros t = new TablaEnteros(tabla);
		t.posicionTabla(7);
	}

	@Test(expected = IllegalArgumentException.class)
	public void CP_TablaNull() {
		Integer[] tabla = null;
		new TablaEnteros(tabla);
	}

	@Test(expected = IllegalArgumentException.class)
	public void CP_TablaVacia() {
		Integer[] tabla = {};
		new TablaEnteros(tabla);
	}
    
}
