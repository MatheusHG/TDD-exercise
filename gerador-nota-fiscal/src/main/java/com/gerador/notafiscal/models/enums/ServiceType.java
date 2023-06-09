package com.gerador.notafiscal.models.enums;

import java.util.ArrayList;
import java.util.List;

public enum ServiceType {
    CONSULTING("Assessoria"),
    TRAINING("Treinamento"),
    OTHER("Outro");

    private final String description;

    ServiceType(String description) {
        this.description = description;
    }

    public static ServiceType getFromDescription(String description) {
        if (description == null) {
            throw new IllegalArgumentException("Service type description must not be null");
        }

        ServiceType[] serviceTypes = ServiceType.values();

        for (ServiceType serviceType : serviceTypes) {
            if (serviceType.getDescription().equals(description)) {
                return serviceType;
            }
        }

        return ServiceType.OTHER;
    }

    public String getDescription() {
        return description;
    }

    public static List<String> getDescriptions() {
        List<String> descriptions = new ArrayList<>();
        ServiceType[] serviceTypes = ServiceType.values();

        for (ServiceType serviceType : serviceTypes) {
            descriptions.add(serviceType.getDescription());
        }

        return descriptions;
    }
}
