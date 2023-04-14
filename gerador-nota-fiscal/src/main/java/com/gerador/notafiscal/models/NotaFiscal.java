package com.gerador.notafiscal.models;

import com.gerador.notafiscal.mappings.ServiceTaxClassification;
import com.gerador.notafiscal.taxCalculators.TaxCalculator;

import java.text.DecimalFormat;

public class NotaFiscal {
    private final Bill bill;

    public NotaFiscal(Bill bill) {
        if (bill == null) {
            throw new IllegalArgumentException("Bill must not be null");
        }

        this.bill = bill;
    }

    public String getClientName() {
        return bill.getClientName();
    }

    public double getBillValue() {
        return bill.getValue();
    }

    public double getTaxValue() {
        ServiceTaxClassification mapping = new ServiceTaxClassification();
        TaxCalculator taxCalculator = mapping.getTaxCalculator(bill.getServiceType());
        return taxCalculator.calculate(getBillValue());
    }

    public String toString() {
        String result = "Client: " + getClientName() + "\n";

        DecimalFormat decimalFormat = new DecimalFormat("R$0.00");
        String formattedBillValue = decimalFormat.format(getBillValue());
        String formattedTaxValue = decimalFormat.format(getTaxValue());

        result += "Payment amount: " + formattedBillValue + "\n";
        result += "Tax amount: " + formattedTaxValue;

        return result;
    }
}
