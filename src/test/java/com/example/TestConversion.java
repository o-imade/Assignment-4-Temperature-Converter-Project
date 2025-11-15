package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConversion
{

    // --- Celsius → Fahrenheit ---
    @Test
    void celsiusToFahrenheit_zero()
    {
        assertEquals(32.0, Main.celsiusToFahrenheit(0.0), 1e-9);
    }

    @Test
    void celsiusToFahrenheit_boiling()
    {
        assertEquals(212.0, Main.celsiusToFahrenheit(100.0), 1e-9);
    }

    //new
    @Test
    void celsiusToFahrenheit_negative()
    {
        assertEquals(-40.0, Main.celsiusToFahrenheit(-40.0), 1e-9);
    }

    // --- Fahrenheit → Celsius ---
    @Test
    void fahrenheitToCelsius_freezing()
    {
        assertEquals(0.0, Main.fahrenheitToCelsius(32.0), 1e-9);
    }

    @Test
    void fahrenheitToCelsius_boiling()
    {
        assertEquals(100.0, Main.fahrenheitToCelsius(212.0), 1e-9);
    }

    //new
    @Test
    void fahrenheitToCelsius_negative()
    {
        assertEquals(-40.0, Main.fahrenheitToCelsius(-40.0), 1e-9);
    }

    // --- Celsius → Kelvin ---
    @Test
    void celsiusToKelvin_zero()
    {
        assertEquals(273.15, Main.celsiusToKelvin(0.0), 1e-9);
    }

    @Test
    void celsiusToKelvin_absoluteZero()
    {
        assertEquals(0.0, Main.celsiusToKelvin(-273.15), 1e-9);
    }

    //new
    @Test
    void celsiusToKelvin_belowAbsoluteZero()
    {
        assertEquals(-1.0, Main.celsiusToKelvin(-274.15), 1e-9);
    }
}
