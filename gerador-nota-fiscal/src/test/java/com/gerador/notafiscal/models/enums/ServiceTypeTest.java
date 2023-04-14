package com.gerador.notafiscal.models.enums;

import com.gerador.notafiscal.App;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ServiceTypeTest {
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrownErrorForNullDescription() {
        ServiceType.getFromDescription(null);
    }
}
