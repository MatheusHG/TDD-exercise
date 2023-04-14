package com.gerador.notafiscal.services;

import com.gerador.notafiscal.models.NotaFiscal;

public class SMTP {
    public void send(NotaFiscal notaFiscal) {
        if (notaFiscal == null) {
            throw new IllegalArgumentException("Null invoices not allowed");
        }

        System.out.println("Sending customer invoice " + notaFiscal.getClientName() + " by email...");
    }
}
