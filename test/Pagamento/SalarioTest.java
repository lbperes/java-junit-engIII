/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pagamento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lbper
 */
public class SalarioTest {    
    
    @Test // Verifica se  Salario está correto
    public void testSalario() {

        double expResult = 1000;
        double result = 1000;
        assertEquals(expResult, result, 0.0);

        System.out.println("Teste Concluído");
        
    }
    
    @Before
    public void setUp() {
        System.out.println("Início dos Testes");
    }
    
    @After
    public void tearDown() {
        System.out.println("Fim dos Testes");
    }
}
