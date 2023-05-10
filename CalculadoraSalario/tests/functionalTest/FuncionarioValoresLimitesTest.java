package functionalTest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FuncionarioValoresLimitesTest {
    // TESTES PARA CARGO DESENVOLVEDOR
    @Test
    public void calculaSalarioDevTaxaMinValorMax(){
        Assertions.assertEquals(2699.1,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
        Assertions.assertEquals(2999 * 0.9,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
    }
    @Test
    public void calculaSalarioDevTaxaMinValorRandom(){
        Assertions.assertEquals(900,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
        Assertions.assertEquals(1000 * 0.9,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
    }
    @Test
    public void calculaSalarioDevTaxaMaiorValorMin(){
        Assertions.assertEquals(2400,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
        Assertions.assertEquals(3000 * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
    }
    @Test
    public void calculaSalarioDevTaxaMaiorValorMaiorQueLimite(){
        Assertions.assertEquals(2400.8,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
        Assertions.assertEquals(3001 * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
    }

    // TESTES PARA CARGO DBA
    @Test
    public void calculaSalarioDBATaxaMinValorMax(){
        Assertions.assertEquals(1999 * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
        Assertions.assertEquals(1699.15,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
    }
    @Test
    public void calculaSalarioDBATaxaMinValorRandom(){
        Assertions.assertEquals(1200 * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
        Assertions.assertEquals(1020,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
    }
    @Test
    public void calculaSalarioDBATaxaMaiorValorMin(){
        Assertions.assertEquals(2000 * 0.75,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
        Assertions.assertEquals(1500,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
    }
    @Test
    public void calculaSalarioDBATaxaMaiorValorMaiorQueLimite(){
        Assertions.assertEquals(2001 * 0.75,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
        Assertions.assertEquals(1500.75,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
    }

    // TESTES PARA CARGO TESTADOR
    @Test
    public void calculaSalarioTestadorTaxaMinValorMax(){
        Assertions.assertEquals(1999 * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
        Assertions.assertEquals(1699.15,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
    }
    @Test
    public void calculaSalarioTestadorTaxaMinValorRandom(){
        Assertions.assertEquals(1200 * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
        Assertions.assertEquals(1020,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
    }
    @Test
    public void calculaSalarioTestadorTaxaMaiorValorMin(){
        Assertions.assertEquals(2000 * 0.75,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
        Assertions.assertEquals(1500,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
    }
    @Test
    public void calculaSalarioTestadorTaxaMaiorValorMaiorQueLimite(){
        Assertions.assertEquals(2001 * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
        Assertions.assertEquals(1500.75,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
    }

    // TESTES PARA CARGO GERENTE
    @Test
    public void calculaSalarioGerenteTaxaMinValorMax(){
        Assertions.assertEquals(4999 * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
        Assertions.assertEquals(3999.2,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
    }
    @Test
    public void calculaSalarioGerenteTaxaMinValorRandom(){
        Assertions.assertEquals(2500 * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
        Assertions.assertEquals(2000,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
    }
    @Test
    public void calculaSalarioGerenteTaxaMaiorValorMin(){
        Assertions.assertEquals(5000 * 0.7,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
        Assertions.assertEquals(3500,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
    }
    @Test
    public void calculaSalarioGerenteTaxaMaiorValorMaiorQueLimite(){
        Assertions.assertEquals(5001 * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
        Assertions.assertEquals(3500.7,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
    }
}
