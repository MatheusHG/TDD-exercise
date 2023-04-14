package com.gerador.notafiscal.services;

import com.gerador.notafiscal.models.NotaFiscal;

public class NotaFiscalDao {
    public void saveToDB(NotaFiscal invoice) {
        if (invoice == null) {
            throw new IllegalArgumentException("Null invoices not allowed");
        }

        System.out.println("Saving the invoice for client " + notaFiscal.getClientName() + " to the database!");
    }
}
