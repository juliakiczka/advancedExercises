package org.example.typWyliczeniowy.zadanie3;

public enum TemperatureConvert {
    C_F('C', 'F', tempIn -> (tempIn * 9 / 5) + 32),
    C_K('C', 'K', tempIn -> tempIn + 273.15f),
    K_C('K', 'C', tempIn -> tempIn - 273.15f),
    F_C('F', 'C', tempIn -> (tempIn - 32) * 5 / 9),
    F_K('F', 'K', tempIn -> (tempIn - 32f) * 5 / 9 + 273.15f),
    K_F('K', 'F', tempIn -> (tempIn + 273.15f) * 9 / 5 + 32);
    private char input;
    private char output;
    private Converter converter;

    TemperatureConvert(char input, char output, Converter converter) {
        this.input = input;
        this.output = output;
        this.converter = converter;
    }

    public static float convertTemperature(char input, char output, float temperature) {
        for (TemperatureConvert temperatureConvert : values()) {
            if (temperatureConvert.input == input && temperatureConvert.output == output) {
                temperatureConvert.converter.convert(temperature);
            }
        }
        return Integer.MIN_VALUE;
    }
}
