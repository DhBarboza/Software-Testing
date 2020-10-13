package model;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConversorTest {
    //Importando as classes com os metodos:
    Conversor convert = new Conversor();

    //Considerando as partições de equivalência,
    //Dividimos os casos de testes em classes válidas e Inválidas
    //Teste de classes Inválidas:
    //Função necessita de um parâmetro numero inteiro ou flutuante para a conversão
    //Utilizamos letra para testar:
    @Test
    public void testPalavra() {
        try {
            celsiusParaFahrenheit('a');
            fail("Should have thrown an exception");
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    //Teste com caractere Coringa:
    @Test
    public void testCoringa() {
        try {
            fahrenheitParaCelsius('@');
            fail("Should have thrown an exception");
        } catch (Exception e) {
            assertTrue(true);
        }
    }
    
    //Testes paras Classes válidas:
    //Dada a temperatura 20ºc Celsius o Resultado esperado é 68ºf Fahrenheit
    @Test
    public void testConvertforFahrenheit() {
        double results = convert.celsiusParaFahrenheit(20);
        assertEquals(68, results, 0);
    }

    //Dado a temperatura 68ºf fahrenheit o resultado esperado é 20ºc Celsius
    @Test
    public void testConvertforCelsius() {
        double result = convert.fahrenheitParaCelsius(68);
        assertEquals(20, result, 0);
    }


}
