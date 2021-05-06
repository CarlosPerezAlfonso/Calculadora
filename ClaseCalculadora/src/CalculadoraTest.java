import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    @Test
    //Test existe el objeto
    public void testClase() {
       Calculadora operacion = new Calculadora(2, 4);

       assertNotNull(operacion);
    }

    @Test
    //Test objetos no son iguales
    public void testIguales() {
        Calculadora operacion1 = new Calculadora(2, 4);
        Calculadora operacion2 = new Calculadora(2, 7);

        assertNotEquals(operacion1, operacion2);
    }

    @Test
    //Test atributos correctos
    public void testAtributos() {
        Calculadora operacion = new Calculadora(2);

        assertEquals(2, operacion.atributos());
    }

    @Test
    //Test suma
    public void testSuma() {
        Calculadora operacion = new Calculadora(2, 4);
        int expectedResult = 6;
        operacion.suma();

        assertEquals(operacion.suma(), expectedResult);
    }

    @Test
    //Test resta
    public void testResta() {
        Calculadora operacion = new Calculadora(4, 2);
        int expectedResult = 2;
        operacion.resta();

        assertEquals(operacion.resta(), expectedResult);
    }

    @Test
    //Test multiplicacion
    public void testMultiplicacion() {
        Calculadora operacion = new Calculadora(2, 4);
        int expectedResult = 8;
        operacion.multiplicacion();

        assertEquals(operacion.multiplicacion(), expectedResult);
    }

    @Test
    //Test division
    public void testDivision() {
        Calculadora operacion = new Calculadora(8, 2);
        int expectedResult = 4;
        operacion.division();

        assertEquals(operacion.division(), expectedResult);
    }

    @Test
    //Test valor abs.
    public void testValorAbs() {
        Calculadora operacion = new Calculadora(-5);
        int expectedResult = 5;

        assertEquals(expectedResult, operacion.valorAbsoluto());
    }

    @Test
    //Test exponente.
    public void testExponente() {
        Calculadora operacion = new Calculadora(2, 3);
        int expectedResult = 8;

        assertEquals(expectedResult, operacion.exponente());
    }

    @Test
    //Test es positivo.
    public void testEsPositivo() {
        Calculadora operacion = new Calculadora(2);
        boolean expectedResult = true;

        assertEquals(expectedResult, operacion.esPositivo());
    }

    

}


