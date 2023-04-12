import org.junit.Test;

public class FuncionarioTest {

  @Test
  public void testCriarUmFuncionario() {
    String nome = "André";
    String email = "andre.martins@ccc.ufcg.edu.br";
    double salarioBase = 3000.00;
    String cargo = "DESENVOLVEDOR";
    
    Funcionario funcionario = new Funcionario();

    assertEquals(nome, funcionario.getNome())
    assertEquals(email, funcionario.getEmail())
    assertEquals(salarioBase, funcionario.getSalarioBase())
    assertEquals(cargo, funcionario.getCargo())
  }
}
