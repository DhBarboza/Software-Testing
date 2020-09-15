package entrega_introducao;

public class Conversor {
  public double celsiusToFahrenheit(double c) {
    return 9 * c / 5 + 32;
  }

  public double fahrenheitToCelsius(double f) {
    return (f - 32) * 5 / 9;
  }
}
