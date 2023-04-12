public class Funcionario {

  private String nome;
  private String email;
  private double salarioBase;
  private Cargo cargo;

  Funcionario(String nome, String email, double salarioBase, Cargo cargo) {
    this.nome = nome;
    this.email = email; 
    this.salarioBase = salarioBase;
    this.cargo = cargo;
  }

  public String getNome() {
    return this.nome;
  }

  public String getEmail() {
    return this.email;
  }

  public double getSalarioBase() {
    return this.salarioBase;
  }

  public Cargo getCargo() {
    return this.cargo;
  }

  public double calculaSalario() {
    return (this.salarioBase - this.cargo.calculaDesconto(this.salarioBase));
  }
}
