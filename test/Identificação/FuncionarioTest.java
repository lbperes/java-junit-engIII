/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Identificação;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author Lucas Braga Peres
 */

public class FuncionarioTest {
    
    Funcionario test1 = new Funcionario();

    @Test // Verifica se o nome está nulo
    public void test_nome_funcionario() {
        test1.set_nome_funcionario("João");
        assertNotNull(test1.get_nome_funcionario());

        if(test1.get_nome_funcionario() != null){
            System.out.println("Teste 01 - Aprovado");
        }      
    }
    
    @Test // Verifica se a matricula está nula
    public void test_matricula_funcionario() {
        test1.set_matrícula("654YFV800");
        assertNotNull(test1.get_matrícula());
        
        if(test1.get_matrícula() != null){
            System.out.println("Teste 02 - Aprovado");
        }
    }
    
    @BeforeClass
    public static void testBegin() {
        System.out.println("Teste Iniciado");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Teste Encerrado");
    }
}
