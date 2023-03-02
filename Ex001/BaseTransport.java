package Seminars.Ex001;

public class BaseTransport {
    private String model, color;
    private int weight, speed, wheels;

    public BaseTransport(int valueWeight, int valueSpeed, int valueWheels, String strModel, String color) {
        this.speed = valueSpeed;
        this.weight = valueWeight;
        this.wheels = valueWheels;
        this.model = strModel;
        this.color = color;       
    }

    public String getInfo() {
        return String.format("Model: %s  Color: %s  Weight: %d Speed: %d Wheels: %d Type: %s",
                this.model, this.color, this.weight, this.speed, 
                this.wheels, this.getClass().getSimpleName());
    }

    public String toString(){
        return getInfo();
    }

    public int SetSpeed(int speed) {
        return this.speed = speed;
    }

    public void GetMove(int speed) {
        if (this.speed > 0) {
            System.out.println("В движении");
        }
        else {
            System.out.println("Стоим");
        }
    }

}