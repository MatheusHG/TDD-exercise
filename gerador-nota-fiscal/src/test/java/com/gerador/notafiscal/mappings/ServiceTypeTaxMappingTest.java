package com.gerador.notafiscal.mappings;

import com.gerador.notafiscal.models.enums.ServiceType;
import com.gerador.notafiscal.taxCalculators.ConsultingTaxCalculator;
import com.gerador.notafiscal.taxCalculators.DefaultTaxCalculator;
import com.gerador.notafiscal.taxCalculators.TaxCalculator;
import com.gerador.notafiscal.taxCalculators.TrainingTaxCalculator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ServiceTaxClassificationTest {
    public ServiceTaxClassification ServiceTaxClassification;

    @Parameter
    public ServiceType serviceType;

    @Parameter(1)
    public TaxCalculator expectedTaxCalculator;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { ServiceType.CONSULTING, new ConsultingTaxCalculator() },
                { ServiceType.TRAINING, new TrainingTaxCalculator() },
                { ServiceType.OTHER, new DefaultTaxCalculator() }
        });
    }

    @Before
    public void setup() {
        this.ServiceTaxClassification = new ServiceTaxClassification();
    }

    @Test
    public void shouldGetCorrectTaxCalculator() {
        TaxCalculator taxCalculator = ServiceTaxClassification.getTaxCalculator(serviceType);
        assertEquals(expectedTaxCalculator.getClass(), taxCalculator.getClass());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnNullServiceType() {
        ServiceTaxClassification.getTaxCalculator(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionOnUnknownServiceType() throws NoSuchFieldException, IllegalAccessException {
        Field mapping = ServiceTaxClassification.class.getDeclaredField("mapping");
        mapping.setAccessible(true);

        ServiceTaxClassification taxMapping = new ServiceTaxClassification();
        mapping.set(taxMapping, new HashMap<ServiceType, TaxCalculator>());

        taxMapping.getTaxCalculator(serviceType);
    }
}
