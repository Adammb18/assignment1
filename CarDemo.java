public class CarDemo
{

public static void main (String[] str) {
    Car Car1 = new Car("porsche", 2004);

    System.out.println("Current status of the car: ");
    System.out.println("Year model: " +Car1.getyearModel());
    System.out.println("Make: " +Car1.getMake());
    for(int i=0; i<5; i++){
        Car1.accelerate();

    }
    System.out.println("Accelerating...");
    System.out.println("Now the speed is: " +Car1.getspeed());
    for (int j=0; j<5; j++){
        Car1.brake();
        
    }
    System.out.println("Braking...");
        System.out.println("Now the speed is: " +Car1.getspeed());

    
}

}