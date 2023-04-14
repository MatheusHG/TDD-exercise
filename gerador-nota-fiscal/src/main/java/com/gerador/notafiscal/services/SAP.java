package com.gerador.notafiscal.services;

import com.gerador.notafiscal.models.NotaFiscal;

public class SAP {
    public void send(NotaFiscal notaFiscal) {
        if (notaFiscal == null) {
            throw new IllegalArgumentException("Null invoices not allowed");
        }

        System.out.println("Sending customer invoice " + notaFiscal.getClientName() + " to SAP...");
    }
}
