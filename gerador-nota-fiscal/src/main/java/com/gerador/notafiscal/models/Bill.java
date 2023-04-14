package com.gerador.notafiscal.models;

import com.gerador.notafiscal.models.enums.ServiceType;

import java.text.DecimalFormat;

public class Bill {
    private final String clientName;
    private final String clientAddress;
    private final ServiceType serviceType;
    private final double value;

    public Bill(String clientName, String clientAddress, ServiceType serviceType, double value) {
        if (clientName == null || clientAddress == null || serviceType == null) {
            throw new IllegalArgumentException("Bill information cannot be null");
        }

        if (value < 0) {
            throw new IllegalArgumentException("The bill value cannot be negative");
        }

        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.serviceType = serviceType;
        this.value = value;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public String getServiceTypeDescription() {
        return serviceType.getDescription();
    }

    public String getClientName() {
        return clientName;
    }

    public double getValue() {
        return value;
    }

    public String toString() {
        String result = "Client: " + clientName + "\n";
        result += "Address: " + clientAddress + "\n";
        result += "Service: " + serviceType.getDescription() + "\n";

        DecimalFormat decimalFormat = new DecimalFormat("R$0.00");
        String formattedNumber = decimalFormat.format(value);

        result += "Payment amount: " + formattedNumber;

        return result;
    }
}
