public class Car
{
    int speed;
    String make;
    int yearModel;

    public Car (String carmake, int year) {
        make=carmake;
        yearModel=year;
        speed=0;
    }
    int getyearModel(){
        return yearModel;
    }
    String getMake(){
        return make;
    }
    int getspeed(){
        return speed;
    }
    public void accelerate() {
        speed = speed + 5;
    }
    public void brake() {
        if (speed!=0)
            speed=speed-5;
    }
}