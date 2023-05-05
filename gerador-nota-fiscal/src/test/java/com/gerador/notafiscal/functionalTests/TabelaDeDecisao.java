package com.gerador.notafiscal.functionalTests;

import org.junit.Before;
import org.junit.Test;

import com.gerador.notafiscal.controllers.InvoiceController;
import com.gerador.notafiscal.models.NotaFiscal;
import com.gerador.notafiscal.models.enums.ServiceType;
import com.gerador.notafiscal.services.NotaFiscalDao;
import com.gerador.notafiscal.services.SAP;
import com.gerador.notafiscal.services.SMTP;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class TabelaDeDecisao {

  static private final double maxDelta = 0.0001;

  public InvoiceController InvoiceController;
  public NotaFiscalDao notaFiscalDao;
  public SAP sap;
  public SMTP smtp;

  @Before
  public void setup() {
      this.notaFiscalDao = mock(NotaFiscalDao.class);
      this.sap = mock(SAP.class);
      this.smtp = mock(SMTP.class);
      this.InvoiceController = new InvoiceController(notaFiscalDao, sap, smtp);
  }

  @Test
  public void shouldBeABillWithConsultingServise() {
    NotaFiscal nota = InvoiceController.generate("André", "Endereço", ServiceType.CONSULTING.getDescription(), 100);

    assertEquals(nota.getTaxValue(), 25.0, maxDelta);

    verify(notaFiscalDao, times(1)).saveToDB(any());
    verify(sap, times(1)).send(any());
    verify(smtp, times(1)).send(any());
  }

  @Test
  public void shouldBeABillWithTrainingServise() {
    NotaFiscal nota = InvoiceController.generate("André", "Endereço", ServiceType.TRAINING.getDescription(), 100);

    assertEquals(nota.getTaxValue(), 15.0, maxDelta);

    verify(notaFiscalDao, times(1)).saveToDB(any());
    verify(sap, times(1)).send(any());
    verify(smtp, times(1)).send(any());
  }

  @Test
  public void shouldBeABillWithOtherServise() {
    NotaFiscal nota = InvoiceController.generate("André", "Endereço", ServiceType.OTHER.getDescription(), 100);

    assertEquals(nota.getTaxValue(), 6.0, maxDelta);

    verify(notaFiscalDao, times(1)).saveToDB(any());
    verify(sap, times(1)).send(any());
    verify(smtp, times(1)).send(any());
  }



}
