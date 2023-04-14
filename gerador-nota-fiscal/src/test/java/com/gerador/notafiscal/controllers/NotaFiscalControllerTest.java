package com.gerador.notafiscal.controllers;

import com.gerador.notafiscal.models.NotaFiscal;
import com.gerador.notafiscal.services.NotaFiscalDao;
import com.gerador.notafiscal.services.SAP;
import com.gerador.notafiscal.services.SMTP;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class InvoiceControllerTest {
    public InvoiceController InvoiceController;
    public NotaFiscalDao notaFiscalDao;
    public SAP sap;
    public SMTP smtp;

    @Parameterized.Parameter
    public String serviceTypeDescription;

    @Parameterized.Parameter(1)
    public double billValue;

    @Parameterized.Parameter(2)
    public double expectedTax;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                // Executar testes para cada tipo de serviço com os seus impostos esperados
                { "Assessoria", 1000.0, 250.0 },
                { "Treinamento", 1000.0, 150.0 },
                { "Outro", 1000.0, 60.0 },
        });
    }

    @Before
    public void setup() {
        this.notaFiscalDao = mock(NotaFiscalDao.class);
        this.sap = mock(SAP.class);
        this.smtp = mock(SMTP.class);
        this.InvoiceController = new InvoiceController(notaFiscalDao, sap, smtp);
    }

    @Test
    public void shouldCreateInvoiceController() {
        InvoiceController controller = new InvoiceController();
        assertNotNull(controller.notaFiscalDao);
        assertNotNull(controller.sap);
        assertNotNull(controller.smtp);
    }

    @Test
    public void testGenerate() {
        NotaFiscal notaFiscal = InvoiceController.generate("Matheus Oliveira", "Rua do sol, 89", serviceTypeDescription, billValue);

        assertEquals(expectedTax, notaFiscal.getTaxValue(), 0.0001);
        assertEquals("Matheus Oliveira", notaFiscal.getClientName());
        assertEquals(billValue, notaFiscal.getBillValue(), 0);

        verify(notaFiscalDao, times(1)).saveToDB(any());
        verify(sap, times(1)).send(any());
        verify(smtp, times(1)).send(any());
    }

    @Test
    public void testGenerateWithZeroBillValue() {
        NotaFiscal notaFiscal = InvoiceController.generate("Matheus Oliveira", "Rua do sol, 89", serviceTypeDescription, 0);

        assertEquals(0, notaFiscal.getTaxValue(), 0);
        assertEquals("Matheus Oliveira", notaFiscal.getClientName());
        assertEquals(0, notaFiscal.getBillValue(), 0);

        verify(notaFiscalDao, times(1)).saveToDB(any());
        verify(sap, times(1)).send(any());
        verify(smtp, times(1)).send(any());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNullClientName() {
        InvoiceController.generate(null, "Rua do sol, 89", serviceTypeDescription, billValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNullClientAddress() {
        InvoiceController.generate("Matheus Oliveira", null, serviceTypeDescription, billValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNullServiceType() {
        InvoiceController.generate("Matheus Oliveira", "Rua do sol, 89", null, billValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNegativeBillValue() {
        InvoiceController.generate("Matheus Oliveira", "Rua do sol, 89", serviceTypeDescription, -billValue);
    }
}
