package com.gerador.notafiscal.services;

import com.gerador.notafiscal.models.Bill;
import com.gerador.notafiscal.models.NotaFiscal;
import com.gerador.notafiscal.models.enums.ServiceType;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class SMTPTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    public NotaFiscal notaFiscal;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Before
    public void setup() {
        Bill bill = new Bill("Matheus Oliveira", "Rua do Sol, 89", ServiceType.CONSULTING, 1000.0);
        this.notaFiscal = new NotaFiscal(bill);
    }
}
