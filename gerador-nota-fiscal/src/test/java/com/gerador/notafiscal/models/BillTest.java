package com.gerador.notafiscal.models;

import com.gerador.notafiscal.models.enums.ServiceType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BillTest {
    public Bill defaultBill;

    @Before
    public void setup() {
        this.defaultBill = new Bill("Matheus Oliveira", "Rua do Sol, 89", ServiceType.CONSULTING, 245.80);
    }

    @Test
    public void shouldCreateBill() {
        new Bill("Pedro Augusto", "Rua do Sol, 89", ServiceType.TRAINING, 34.45);
    }

    @Test
    public void shouldCreateBillWithOtherService() {
        new Bill("Pedro Augusto", "Rua do Sol, 89", ServiceType.OTHER, 34.45);
    }

    @Test()
    public void shouldCreateWithZeroValue() {
        new Bill("Pedro Augusto", "Rua do Sol, 89", ServiceType.OTHER, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowErrorOnNegativeValue() {
        new Bill("Pedro Augusto", "Rua do Sol, 89", ServiceType.OTHER, -34.45);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowErrorOnNullClientName() {
        new Bill(null, "Rua do Sol, 89", ServiceType.OTHER, 34.45);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowErrorOnNullClientAddress() {
        new Bill("Pedro Augusto", null, ServiceType.OTHER, 34.45);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowErrorOnNullServiceType() {
        new Bill("Pedro Augusto", "Rua do Sol, 89", null, 34.45);
    }

    @Test
    public void shouldGetBillServiceType() {
        assertEquals(ServiceType.CONSULTING, defaultBill.getServiceType());
    }

    @Test
    public void shouldGetBillServiceTypeDescription() {
        assertEquals("Assessoria", defaultBill.getServiceTypeDescription());
    }

    @Test
    public void shouldGetClientName() {
        assertEquals("Matheus Oliveira", defaultBill.getClientName());
    }

    @Test
    public void shouldGetBillValue() {
        assertEquals(245.80, defaultBill.getValue(), 0);
    }

    @Test
    public void shouldHasToString() {
        String expectedString = "Client: Matheus Oliveira\n" +
                "Address: Rua do Sol, 89\n" +
                "Service: Assessoria\n" +
                "Invoice amount: R$245.80";

        assertEquals(expectedString, defaultBill.toString());
    }

    @Test
    public void testToStringWithZeroValue() {
        Bill bill = new Bill("Pedro Augusto", "Rua do Sol, 89", ServiceType.TRAINING, 0);

        String expectedString = "Client: Pedro Augusto\n" +
                "Address: Rua do Sol, 89\n" +
                "Service: Treinamento\n" +
                "Invoice amount: R$0.00";

        assertEquals(expectedString, bill.toString());
    }
}
