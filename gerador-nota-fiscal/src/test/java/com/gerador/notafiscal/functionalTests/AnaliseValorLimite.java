package com.gerador.notafiscal.functionalTests;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.gerador.notafiscal.models.Bill;
import com.gerador.notafiscal.models.NotaFiscal;
import com.gerador.notafiscal.models.enums.ServiceType;

@RunWith(Parameterized.class)
public class AnaliseValorLimite {
  static private final double maxDelta = 0.0001;

  @Parameter
  public Bill bill;

  @Parameter(1)
  public double expected;

  @Parameters
  public static Collection<Object[]> bills() {
      return Arrays.asList(new Object[][] {
              // Executar testes para cada calculadora com os seus impostos esperados
              { new Bill("André", "Endereço", ServiceType.CONSULTING, 100), 25.0 },
              { new Bill("André", "Endereço", ServiceType.CONSULTING, 1), 0.25 },
              { new Bill("André", "Endereço", ServiceType.CONSULTING, 0), 0.0 },
              { new Bill("André", "Endereço", ServiceType.TRAINING, 100), 15.0 },
              { new Bill("André", "Endereço", ServiceType.TRAINING, 1), 0.15 },
              { new Bill("André", "Endereço", ServiceType.TRAINING, 0), 0.0 },
              { new Bill("André", "Endereço", ServiceType.OTHER, 100), 6.0 },
              { new Bill("André", "Endereço", ServiceType.OTHER, 1), 0.06 },
              { new Bill("André", "Endereço", ServiceType.OTHER, 0), 0.0 },
      });
  }


  @Test
  public void shouldGetTaxValue() {
    NotaFiscal nota = new NotaFiscal(bill);
    assertEquals(nota.getTaxValue(), expected, maxDelta);
  }
  

}
