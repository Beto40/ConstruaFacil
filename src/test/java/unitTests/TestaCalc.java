package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestaCalc {
    @Test

    public void testarSomaDoisNumeros(){
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 13;

       int resultadoAtual = Calc.somarDoisNumeros(num1, num2);

        System.out.println("O resultado Esperado é " + resultadoEsperado + "\n O resultado Atual foi " + resultadoAtual);


        assertEquals(resultadoEsperado, resultadoAtual);


    }



}
