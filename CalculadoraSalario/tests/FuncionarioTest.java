import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FuncionarioTest {

  @Test
  public void testCriarUmFuncionario() {
    String nome = "André";
    String email = "andre.martins@ccc.ufcg.edu.br";
    double salarioBase = 3000.00;
    Cargo cargo = Cargo.DESENVOLVEDOR;
    
    Funcionario funcionario = new Funcionario(nome, email, salarioBase, cargo);

    assert(funcionario.getNome().equals(nome));
    assert(funcionario.getEmail().equals(email));
    assert(funcionario.getSalarioBase() == (salarioBase));
    assert(funcionario.getCargo().equals(cargo));
  }

  @Test
  public void testCalcularSalarioDesenvolvedor() {
    String nome = "André";
    String email = "andre.martins@ccc.ufcg.edu.br";
    Cargo cargo = Cargo.DESENVOLVEDOR;

    double _10PERCENT = 0.1;
    double _20PERCENT = 0.2;
    
    double salarioMenor = 2999.99;
    double salarioIgual = 3000.00;
    double salarioMaior = 3000.01;

    Funcionario funcionarioMenor3000 = new Funcionario(nome, email, salarioMenor, cargo);
    Funcionario funcionarioIgual3000 = new Funcionario(nome, email, salarioIgual, cargo);
    Funcionario funcionarioMaior3000 = new Funcionario(nome, email, salarioMaior, cargo);

    assertEquals(
      "Calcula salário de funcionario com salario base menor que 3000",
      salarioMenor - (salarioMenor * _10PERCENT),
      funcionarioMenor3000.calculaSalario()
    );

    assertEquals(
      "Calcula salário de funcionario com salario base igual a 3000",
      salarioIgual - (salarioIgual * _10PERCENT),
      funcionarioIgual3000.calculaSalario()
    );

    assertEquals(
      "Calcula salário de funcionario com salario base maior que 3000",
      salarioMaior - (salarioMaior * _10PERCENT),
      funcionarioMaior3000.calculaSalario()
    );
  }
}
