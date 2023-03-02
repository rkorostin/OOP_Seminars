package Seminars.Ex001;

public class Car extends BaseTransport {
    private String carBody;

    public Car(int valueWeight, int valueSpeed, int valueWheels, 
    String strModel, String color, String carBody) {
        super(valueWeight, valueSpeed, valueWheels, strModel, color);
        this.carBody = carBody;
    }

    public String getInfo() {
        return String.format("Body: %s %s", this.carBody, super.getInfo());
    }
   
}