
package atividade_pratica_01;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    //Particionamento com Classes Inválidas
    //Entrada com letra ou caracteres coringas
    //Test com Letra letra
    @Test public void testInvalido(Exception e){
        Conversor convert = new Conversor();
        convert.celsiusToFahrenheit('a');
        fail(e.getMessage());
    }

    //Teste com caractere coringa:
    @Test public void testInvalido2(Exception e) {
        Conversor convert = new Conversor();
        convert.fahrenheitToCelsius('@');
        fail(e.getMessage());
    }


    //Particionamento de Testes com Classe válida 
    //Entrada número inteiro ou flutuante, 
    //Saída do calculo correto
      //Test Method  
    //Dada a temperatura 20ºc Celsius o Resultado esperado é 68ºf
    @Test public void testCoverterCtF(){
        Conversor convert = new Conversor();
        double results = convert.celsiusToFahrenheit(20);
        assertEquals(68, results, 0);
    }

    //Dado a temperatura 68ºf fahrenheit o resultado esperado é 20ºc Celsius
    @Test public void testCoverterFtC() {
        Conversor convert = new Conversor();
        double result = convert.fahrenheitToCelsius(68);
        assertEquals(20, result, 0);
    }
}
