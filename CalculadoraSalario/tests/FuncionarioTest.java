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

    double salarioMenor = 2999;
    double salarioIgual = 3000;
    double salarioMaior = 3001;
    
    double salarioMenorComDescontoMenor = salarioMenor - (salarioMenor * 0.10);
    double salarioIgualComDescontoMaior = salarioIgual - (salarioIgual * 0.20);
    double salarioMaiorComDescontoMaior = salarioMaior - (salarioMaior * 0.20);

    Funcionario funcionarioMenor = new Funcionario(nome, email, salarioMenor, cargo);
    Funcionario funcionarioIgual = new Funcionario(nome, email, salarioIgual, cargo);
    Funcionario funcionarioMaior = new Funcionario(nome, email, salarioMaior, cargo);

    assert(salarioMenorComDescontoMenor == funcionarioMenor.calculaSalario());
    assert(salarioIgualComDescontoMaior == funcionarioIgual.calculaSalario());
    assert(salarioMaiorComDescontoMaior == funcionarioMaior.calculaSalario());
  }

  @Test
  public void testCalcularSalarioDBA() {
    String nome = "André";
    String email = "andre.martins@ccc.ufcg.edu.br";
    Cargo cargo = Cargo.DBA;

    double salarioMenor = 1999;
    double salarioIgual = 2000;
    double salarioMaior = 2001;
    
    double salarioMenorComDescontoMenor = salarioMenor - (salarioMenor * 0.15);
    double salarioIgualComDescontoMaior = salarioIgual - (salarioIgual * 0.25);
    double salarioMaiorComDescontoMaior = salarioMaior - (salarioMaior * 0.25);

    Funcionario funcionarioMenor = new Funcionario(nome, email, salarioMenor, cargo);
    Funcionario funcionarioIgual = new Funcionario(nome, email, salarioIgual, cargo);
    Funcionario funcionarioMaior = new Funcionario(nome, email, salarioMaior, cargo);

    System.out.println(funcionarioMenor.calculaSalario());

    assert(salarioMenorComDescontoMenor == funcionarioMenor.calculaSalario());
    assert(salarioIgualComDescontoMaior == funcionarioIgual.calculaSalario());
    assert(salarioMaiorComDescontoMaior == funcionarioMaior.calculaSalario());
  }

  @Test
  public void testCalcularSalarioTestador() {
    String nome = "André";
    String email = "andre.martins@ccc.ufcg.edu.br";
    Cargo cargo = Cargo.TESTADOR;

    double salarioMenor = 1999;
    double salarioIgual = 2000;
    double salarioMaior = 2001;
    
    double salarioMenorComDescontoMenor = salarioMenor - (salarioMenor * 0.15);
    double salarioIgualComDescontoMaior = salarioIgual - (salarioIgual * 0.25);
    double salarioMaiorComDescontoMaior = salarioMaior - (salarioMaior * 0.25);

    Funcionario funcionarioMenor = new Funcionario(nome, email, salarioMenor, cargo);
    Funcionario funcionarioIgual = new Funcionario(nome, email, salarioIgual, cargo);
    Funcionario funcionarioMaior = new Funcionario(nome, email, salarioMaior, cargo);

    assert(salarioMenorComDescontoMenor == funcionarioMenor.calculaSalario());
    assert(salarioIgualComDescontoMaior == funcionarioIgual.calculaSalario());
    assert(salarioMaiorComDescontoMaior == funcionarioMaior.calculaSalario());
  }

  @Test
  public void testCalcularSalarioGerente() {
    String nome = "André";
    String email = "andre.martins@ccc.ufcg.edu.br";
    Cargo cargo = Cargo.GERENTE;

    double salarioMenor = 4999;
    double salarioIgual = 5000;
    double salarioMaior = 5001;
    
    double salarioMenorComDescontoMenor = salarioMenor - (salarioMenor * 0.20);
    double salarioIgualComDescontoMaior = salarioIgual - (salarioIgual * 0.30);
    double salarioMaiorComDescontoMaior = salarioMaior - (salarioMaior * 0.30);

    Funcionario funcionarioMenor = new Funcionario(nome, email, salarioMenor, cargo);
    Funcionario funcionarioIgual = new Funcionario(nome, email, salarioIgual, cargo);
    Funcionario funcionarioMaior = new Funcionario(nome, email, salarioMaior, cargo);

    assert(salarioMenorComDescontoMenor == funcionarioMenor.calculaSalario());
    assert(salarioIgualComDescontoMaior == funcionarioIgual.calculaSalario());
    assert(salarioMaiorComDescontoMaior == funcionarioMaior.calculaSalario());
  }

}
