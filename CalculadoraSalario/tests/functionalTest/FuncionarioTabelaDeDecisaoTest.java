package functionalTest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FuncionarioTabelaDeDecisaoTest {
    // TESTES PARA CARGO DEV
    @Test
    public void calculaSalarioCargoDevSalarioMenor2k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.9,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
        Assertions.assertEquals(1999 * random.nextDouble() * 0.9,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
    }
    @Test
    public void calculaSalarioCargoDevSalarioMaior2kMenor3k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.9,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
        Assertions.assertEquals(2000 + (2999-2000) * random.nextDouble() * 0.9,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
    }
    @Test
    public void calculaSalarioCargoDevSalarioMaior3kMenor5k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
        Assertions.assertEquals(3000 + (4999-3000) * random.nextDouble() * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
    }
    @Test
    public void calculaSalarioCargoDevSalarioMaior5k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
        Assertions.assertEquals(5000 + 5000 * random.nextDouble() * 5000 + 5000 * random.nextDouble(),
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DESENVOLVEDOR));
    }

    // TESTES PARA CARGO DBA
    @Test
    public void calculaSalarioCargoDBASalarioMenor2k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
        Assertions.assertEquals(1999 * random.nextDouble() * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
    }
    @Test
    public void calculaSalarioCargoDBASalarioMaior2kMenor3k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.75,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
        Assertions.assertEquals(2000 + (2999-2000) * random.nextDouble() * 0.75,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA)));
    }
    @Test
    public void calculaSalarioCargoDBASalarioMaior3kMenor5k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.75,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
        Assertions.assertEquals(3000 + (4999-3000) * random.nextDouble() * 0.75,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
    }
    @Test
    public void calculaSalarioCargoDBASalarioMaior5k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.75,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
        Assertions.assertEquals(5000 + 5000 * random.nextDouble() * 0.75,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.DBA));
    }

    // TESTES PARA CARGO TESTADOR
    @Test
    public void calculaSalarioCargoTestadorSalarioMenor2k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
        Assertions.assertEquals(1999 * random.nextDouble() * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
    }
    @Test
    public void calculaSalarioCargoTestadorSalarioMaior2kMenor3k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
        Assertions.assertEquals(2000 + (2999-2000) * random.nextDouble() * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
    }
    @Test
    public void calculaSalarioCargoTestadorSalarioMaior3kMenor5k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
        Assertions.assertEquals(3000 + (4999-3000) * random.nextDouble() * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
    }
    @Test
    public void calculaSalarioCargoTestadorSalarioMaior5k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
        Assertions.assertEquals(5000 + 5000 * random.nextDouble() * 0.85,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.TESTADOR));
    }

    // TESTES PARA CARGO GERENTE
    @Test
    public void calculaSalarioCargoGerenteSalarioMenor2k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
        Assertions.assertEquals(1999 * random.nextDouble() * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
    }
    @Test
    public void calculaSalarioCargoGerenteSalarioMaior2kMenor3k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
        Assertions.assertEquals(2000 + (2999-2000) * random.nextDouble() * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
    }
    @Test
    public void calculaSalarioCargoGerenteSalarioMaior3kMenor5k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
        Assertions.assertEquals(3000 + (4999-3000) * random.nextDouble() * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
    }
    @Test
    public void calculaSalarioCargoGerenteSalarioMaior5k(){
        Assertions.assertEquals(funcionario.getSalarioBase() * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
        Assertions.assertEquals(5000 + 5000 * random.nextDouble() * 0.8,
                new Funcionario("Matheus Henrique", "mhenriique18@gmail.com", 1300, Cargo.GERENTE));
    }
}
