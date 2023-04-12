public enum Cargo {
  DESENVOLVEDOR(10, 20, 3000),
  DBA(15, 25, 2000),
  TESTADOR(15, 25, 2000),
  GERENTE(20, 30, 5000);

  private double menorDesconto;
  private double maiorDesconto;
  private double limite;

  private Cargo(double menorDesconto, double maiorDesconto, double limite) {
    this.menorDesconto = menorDesconto / 100;
    this.maiorDesconto = maiorDesconto / 100;
    this.limite = limite;
  }

  public double calculaDesconto(double salarioBase) {
    if(salarioBase >= this.limite) return salarioBase * this.maiorDesconto;
    return salarioBase * this.menorDesconto;
  }
}