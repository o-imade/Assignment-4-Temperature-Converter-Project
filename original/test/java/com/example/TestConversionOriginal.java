package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConversionOriginal
{

    @Test
    void testCelsiusToFahrenheit()
    {
        assertEquals(68, TempConvProgram.CtoF(20), 1e-9);
    }

    @Test
    void testFahrenheitToCelsius()
    {
        assertEquals(20, TempConvProgram.f_to_c(68), 1e-9);
    }

    @Test
    void celsiusToKelvin()
    {
        assertEquals(293.15, TempConvProgram.CtoK(20), 1e-9);
    }
}
