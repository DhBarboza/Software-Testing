package entrega_introducao;

public class Conversor {
  //conversion method from Celsius to Fahrenheit:
  public double celsiusToFahrenheit(double c) {
    return 9 * c / 5 + 32;
  }
  
  //Conversion Method from Fahrenheit To Celsius
  public double fahrenheitToCelsius(double f) {
    return (f - 32) * 5 / 9;
  }

  //Conversion Method from Celsius To Kelvin:
  public double celsiusToKelvin(double c) {
    return c + 273.15;
  }

  //Conversion Method from   To Celsius:
  public double kelvinToCelsius(double k) {
    return k - 273.15;
  }
}
