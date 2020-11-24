/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pagamento;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lbper
 */
public class Calculo_SalarioTest {

    Calculo_Salario teste = new Calculo_Salario();
    double fator_dias;
    double fator_horas;

    @Before
    public void setUp() {
        System.out.println("Início dos Testes");
    }

    @After
    public void tearDown() {
        System.out.println("Fim dos Testes");
    }

    @Test // testa se o salário proporcional bate com o esperado
    public void testCalculo_Salario() {
        System.out.println("Cálculo de Salário Proporcional");
        //Calculo_Salario teste = new Calculo_Salario();

        teste.set_salario(1000); // salario(1000) * 1 * 1 = 1000
        teste.set_dias_trabalhados(30); // 30 / 30 = 1
        teste.set_horas_trabalhadas(8); // 8 / 8 = 1    

        System.out.println("----------");
        System.out.println("Salário Total: " + teste.get_salario());
        System.out.println("Dias Trabalhados: " + teste.get_dias_trabalhados());
        System.out.println("Horas Trabalhadas: " + teste.get_horas_trabalhadas());

        fator_dias = teste.get_dias_trabalhados() / 30;
        fator_horas = teste.get_horas_trabalhadas() / 8;

        System.out.println("Fator Dias: " + fator_dias);
        System.out.println("Fator Horas: " + fator_horas);
        System.out.printf("Cálculo = [%.1f * %.1f * %.0f] \n", fator_dias, fator_horas, teste.get_salario());

        double result = teste.get_salario() * fator_horas * fator_dias;
        System.out.println("Salário Prop: " + result);
        System.out.println("----------");
        
        double expResult = 1000;
        assertEquals(expResult, result, 0.0);

    }

    @Test // testa se os dias trabalhados no mês passa de 30
    public void testFator_dias() {
        System.out.println("Dias Trabalhados");
        boolean dias = true;
        boolean expResult = true;
        
        teste.set_dias_trabalhados(50); // trabalhou 50 dias no mês
        fator_dias = teste.get_dias_trabalhados() / 30;
        
        if (fator_dias > 1) {
            dias = false;
        }
        System.out.println("----------");
        System.out.println("Dias trabalhados: "+teste.get_dias_trabalhados());
        System.out.printf("Fator dias: %.1f\n", fator_dias);
        System.out.println("Dias Trabalhados < 30: " +dias);
        System.out.println("----------");
        
        assertEquals(expResult, dias);
    }
}
