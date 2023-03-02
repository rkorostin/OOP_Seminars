package Seminars.Ex001;

public class Program {
    public static void main(String[] args) {
        BaseTransport baseT = new BaseTransport(1000, 200, 
        4, "BMW", "green");

        System.out.println(baseT.getInfo());
        System.out.println(baseT);

        baseT.GetMove(baseT.SetSpeed(400));
        System.out.println(baseT);

        Car car1 = new Car(1500, 0, 4,
         "bmw", "red", "sedan");

         
        System.out.println("-----------");
        
        car1.GetMove(car1.SetSpeed(0));
        System.out.println(car1);


    }
}
