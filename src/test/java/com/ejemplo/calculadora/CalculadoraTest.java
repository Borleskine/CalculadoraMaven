package com.ejemplo.calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.restar(4, 3));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDividirPorCero() {
        Calculadora calc = new Calculadora();
        calc.dividir(1, 0);
    }
}
