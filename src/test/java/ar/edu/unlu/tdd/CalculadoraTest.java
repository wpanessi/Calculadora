package ar.edu.unlu.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
//    @Test
//    public final void elMetodoSumarNoPermiteMasDeDosElementos(){
//        assertThrows(RuntimeException.class, () -> Calculadora.sumar("1,2,3"));
//    }
    @Test
    public final void elMetodoSumarPermiteDosElementosOMenos(){
        Calculadora.sumar("5,2");
    }

    @Test
    public final void elMetodoSumarNoPermiteOtraCosaQueNumeros(){
        assertThrows(RuntimeException.class, () -> Calculadora.sumar("5,j"));
    }
    @Test
    public final void elMetodoSumarPermiteUnElementos(){
        Calculadora.sumar("5");
    }
    @Test
    public final void elMetodoSumarDebeSumarLosArgumentos(){
        assertEquals(7, Calculadora.sumar("5,2"));
    }

    @Test
    public final void elMetodoSumarDebeSumarLosArgumentosV2(){
        assertEquals(8, Calculadora.sumar("5,3"));
    }

    @Test
    public final void elMetodoSumarDevuelveElValorDelNumeroSiEsUnicoArgumento(){
        assertEquals(3, Calculadora.sumar("3"));
    }
    @Test
    public final void elMetodoSumarDevuelveCeroSiLaCadenaEsVacia(){
        assertEquals(0, Calculadora.sumar(""));
    }

    @Test
    public final void elMetodoSumarPuedeSumarMasDeDosElementos(){
        Calculadora.sumar("1,2,3");
    }

    @Test
    public final void elMetodoSumarSumaArgumentosMayoresANueve(){
        assertEquals(3015, Calculadora.sumar("15,3000"));
    }

    @Test
    public final void elMetodoSumarPermiteSaltosDeLinea(){
        assertEquals(47, Calculadora.sumar("15\n2,30"));
    }

    @Test
    public final void elMetodoSumarPermiteDefinirSeparador(){
        assertEquals(47, Calculadora.sumar("//;\n15;2;30"));
    }


}