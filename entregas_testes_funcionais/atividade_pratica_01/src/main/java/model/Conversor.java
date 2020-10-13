package model;

public class Conversor {
    public double celsiusParaFahrenheit(double celsius) {
        double f = 9 * celsius / 5 + 32;
        return f;
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        double c = (fahrenheit - 32) * 5 / 9;
        return c;
    }

}
