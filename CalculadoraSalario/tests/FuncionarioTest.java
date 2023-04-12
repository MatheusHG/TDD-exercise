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
}
