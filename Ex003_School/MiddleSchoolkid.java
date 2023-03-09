package Seminars.Ex003_School;

public class MiddleSchoolkid extends Schoolkid implements Playable, Smoke{

    @Override
    public void study() {
         System.out.println("Я не люблю учиться");      
    }

    public void play() {
        System.out.println("Я играю в игру");
    }

    public void smoke() {
        System.out.println("Я начинаю курить");
    }

    @Override
    public String toString() {
        return "Средний класс:";
    }

}
