import java.util.Scanner;

public class TemperatureDemo
{

public static void main(String[] str) {
    double ftemp; 
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a Fahreneheit temperature");

    ftemp=keyboard.nextDouble();

    Temperature temp=new Temperature(ftemp);

    temp.setFahrenheit(ftemp);

    System.out.println("the temperature in fahrenheit is: " +temp.getFahrenheit());
    System.out.println("the temperature in celsius is: " +temp.getCelsius());
    System.out.println("the temperature in kelvin is: " +temp.getKelvin());
}
}