public class Temperature
{
    double ftemp;
    Temperature(double ftemp)
    {
        this.ftemp=ftemp;

    }

public void setFahrenheit(double ftemp){
    this.ftemp=ftemp;
}
double getFahrenheit(){
    return ftemp; //temp is already in fahrenheit so return same temp
}
double getCelsius(){
    return ((double)5/9 * (ftemp - 32));//convert from fahrenheit to celsius using Celsius = (5/9) * (Fahrenheit - 32)
}
double getKelvin(){
    return (((double)5/9 * (ftemp-32))+273);// convert to kelvins using Kelvin = ((5/9) * (Fahrenheit - 32)) + 273
}
}
