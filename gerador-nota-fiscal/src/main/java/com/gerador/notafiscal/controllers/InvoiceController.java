package com.gerador.notafiscal.controllers;

import com.gerador.notafiscal.models.Bill;
import com.gerador.notafiscal.models.NotaFiscal;
import com.gerador.notafiscal.models.enums.ServiceType;
import com.gerador.notafiscal.services.NotaFiscalDao;
import com.gerador.notafiscal.services.SAP;
import com.gerador.notafiscal.services.SMTP;

public class InvoiceController {
    public NotaFiscalDao notaFiscalDao;
    public SAP sap;
    public SMTP smtp;

    public InvoiceController(NotaFiscalDao notaFiscalDao, SAP sap, SMTP smtp) {
        this.notaFiscalDao = notaFiscalDao;
        this.sap = sap;
        this.smtp = smtp;
    }

    public InvoiceController() {
        this.notaFiscalDao = new NotaFiscalDao();
        this.sap = new SAP();
        this.smtp = new SMTP();
    }

    public NotaFiscal generate(String nameUser, String addressUser, String typeServiceDescription, double invoiceAmount) {
        if (nameUser == null || addressUser == null || typeServiceDescription == null) {
            throw new IllegalArgumentException("Customer and service type information must be met.");
        }

        ServiceType serviceType = ServiceType.getFromDescription(typeServiceDescription);
        Bill bill = new Bill(nameUser, addressUser, serviceType, invoiceAmount);

        NotaFiscal invoice = new NotaFiscal(bill);
        sendNotaFiscalWithServices(invoice);

        return invoice;
    }

    private void sendNotaFiscalWithServices(NotaFiscal invoice) {
        notaFiscalDao.saveToDB(invoice);
        sap.send(invoice);
        smtp.send(invoice);
    }
}
