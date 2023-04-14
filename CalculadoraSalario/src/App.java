public class App {
    public static void main(String[] args) throws Exception {
      Funcionario funcionario1 = new Funcionario("André", "andre.martins@ccc.ufcg.edu.br", 2000, Cargo.DESENVOLVEDOR);
      Funcionario funcionario2 = new Funcionario("Matheus", "matheus.henrique@ccc.ufcg.edu.br", 3000, Cargo.DBA);
      Funcionario funcionario3 = new Funcionario("Leslie", "leslie@ccc.ufcg.edu.br", 10000, Cargo.GERENTE);
      Funcionario funcionario4 = new Funcionario("jonny", "jonny@ccc.ufcg.edu.br", 1000, Cargo.TESTADOR);

      System.out.println(funcionario1);
      System.out.println(funcionario2);
      System.out.println(funcionario3);
      System.out.println(funcionario4);
    }
}
