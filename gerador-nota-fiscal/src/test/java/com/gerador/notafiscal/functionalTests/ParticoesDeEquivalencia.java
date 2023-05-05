package com.gerador.notafiscal.functionalTests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gerador.notafiscal.models.Bill;
import com.gerador.notafiscal.models.NotaFiscal;
import com.gerador.notafiscal.models.enums.ServiceType;

public class ParticoesDeEquivalencia {
  static private final double maxDelta = 0.0001;

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowErrorOnNullClientName() {
    new Bill(null, "Endereço", ServiceType.CONSULTING, 100);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowErrorOnNullClientAddress() {
    new Bill("André", null, ServiceType.CONSULTING, 100);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowErrorOnNullServiceType() {
    new Bill("André", "Endereço", null, 100);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowErrorOnNegativeValue() {
    new Bill("André", "Endereço", ServiceType.CONSULTING, -1);
  }

  @Test
  public void shouldGetTaxValue() {
    NotaFiscal nota = new NotaFiscal(new Bill("André", "Endereço", ServiceType.CONSULTING, 100));
    assertEquals(nota.getTaxValue(), 25.0, maxDelta);

    nota = new NotaFiscal(new Bill("André", "Endereço", ServiceType.TRAINING, 100));
    assertEquals(nota.getTaxValue(), 15.0, maxDelta);

    nota = new NotaFiscal(new Bill("André", "Endereço", ServiceType.OTHER, 100));
    assertEquals(nota.getTaxValue(), 6.0, maxDelta);
  }

}
