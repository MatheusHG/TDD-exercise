import org.junit.Test;

public class CargoTest {
 
  @Test
  public void testCalcularDescontoDesenvolvedor() {
    Cargo cargo = Cargo.DESENVOLVEDOR;

    double salario1 = 3000.00;
    double salario2 = 3000.01;
    double salario3 = 2999.99;

    assert(cargo.calculaDesconto(salario1) == salario1 * 0.2);
    assert(cargo.calculaDesconto(salario2) == salario2 * 0.2);
    assert(cargo.calculaDesconto(salario3) == salario3 * 0.1);
  }

  @Test
  public void testCalcularDescontoDBA() {
    Cargo cargo = Cargo.DBA;

    double salario1 = 2000.00;
    double salario2 = 2000.01;
    double salario3 = 1999.99;

    assert(cargo.calculaDesconto(salario1) == salario1 * 0.25);
    assert(cargo.calculaDesconto(salario2) == salario2 * 0.25);
    assert(cargo.calculaDesconto(salario3) == salario3 * 0.15);
  }

  @Test
  public void testCalcularDescontoTestador() {
    Cargo cargo = Cargo.TESTADOR;

    double salario1 = 2000.00;
    double salario2 = 2000.01;
    double salario3 = 1999.99;

    assert(cargo.calculaDesconto(salario1) == salario1 * 0.25);
    assert(cargo.calculaDesconto(salario2) == salario2 * 0.25);
    assert(cargo.calculaDesconto(salario3) == salario3 * 0.15);
  }

  @Test
  public void testCalcularDescontoGerente() {
    Cargo cargo = Cargo.GERENTE;

    double salario1 = 5000.00;
    double salario2 = 5000.01;
    double salario3 = 4999.99;

    assert(cargo.calculaDesconto(salario1) == salario1 * 0.3);
    assert(cargo.calculaDesconto(salario2) == salario2 * 0.3);
    assert(cargo.calculaDesconto(salario3) == salario3 * 0.2);
  }
}
