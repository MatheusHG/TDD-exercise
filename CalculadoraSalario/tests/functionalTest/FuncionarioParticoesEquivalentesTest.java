package functionalTest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FuncionarioParticoesEquivalentesTest {

    @Test
    void calculaSalarioDevMaior3k() {
        Assertions.assertEquals(4800,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
        Assertions.assertEquals(6000 * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
    }

    @Test
    public void calculaSalarioDevMenor3k() {
        Assertions.assertEquals(1170, new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
        Assertions.assertEquals(1300 * 0.9,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
    }

    @Test
    public void calculaSalarioDBAMaior2k() {
        Assertions.assertEquals(3700 * 0.75,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
        Assertions.assertEquals(2775, new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
    }

    @Test
    public void calculaSalarioDBAMenor2k() {
        Assertions.assertEquals(1450 * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
        Assertions.assertEquals(1232.5,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
    }

    @Test
    public void calculaSalarioTestadorMaior2k() {
        funcionario.setSalarioBase(SALARIO_DBA_TESTADOR_MAIOR_2K);
        funcionario.setCargo(Cargo.TESTADOR);
        Assertions.assertEquals(3700 * 0.75,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
        Assertions.assertEquals(2775,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
    }

    @Test
    public void calculaSalarioTestadorMenor2k() {
        Assertions.assertEquals(1450 * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
        Assertions.assertEquals(1232.5,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
    }

    @Test
    public void calculaSalarioGerenteMaior5k() {
        Assertions.assertEquals(8000 * 0.7,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
        Assertions.assertEquals(5600,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
    }

    @Test
    public void calculaSalarioGerenteMenor5k() {
        Assertions.assertEquals(3400 * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
        Assertions.assertEquals(2720,new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
    }
}