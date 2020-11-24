package Recursos_Humanos;

import Pagamento.Calculo_Salario;
import Pagamento.Salario;
import Identificação.Empresa;
import Identificação.Funcionario;

/**
 *
 * @author Lucas Braga Peres
 */
public class RH_Central {
    
    public static void main(String ags[]){
        Salario s = new Salario();
        Calculo_Salario c = new Calculo_Salario();
        Empresa d = new Empresa();
        Funcionario e = new Funcionario();
        
        s = valores(s);
        s.get_salario();
        d.set_nome_Empresa("Fábrica de Copos");
        d.set_seção("Modela Vidro");
        e.set_nome_funcionario("Francisco José");
        e.set_matrícula("654YFV800");
        Imprime(c, d, e, s);
        
        c.set_salario(3456.98); // salario(3456.98) * 0.7 * 1.25 = 3024,8575
        c.set_dias_trabalhados(21); // 21 / 30 = 0.7
        c.set_horas_trabalhadas(10); // 10 / 8 = 1.25
        d.set_nome_Empresa("Medicinal Lama Negra");
        d.set_seção("Shampoo Peruíbe");
        e.set_nome_funcionario("Regina Itatins");
        e.set_matrícula("178RUA7380");
        Imprime(c, d, e, c);
    }
    
    public static Salario valores(Salario r){
        r.set_salario(1234.90); // salario(1234.90) * 0,933 * 1,1 = 1267,
        r.set_horas_trabalhadas(8.8); // 8.8 / 8 = 1,1
        r.set_dias_trabalhados(28); // 28 / 30 = 0,933
        
        return r;
    }
    
    public static void Imprime(Calculo_Salario c, Empresa d, Funcionario e, Salario r){
        System.out.println("Empresa: " + d.get_nome_Empresa());
        System.out.println("Seção: " + d.get_seção());
        System.out.println("Funcionário: " + e.get_nome_funcionario());
        System.out.println("Matrícula: " + e.get_matrícula());
        System.out.println("Salário: R$ " + c.Calculo_Salario(r));
    }
}
