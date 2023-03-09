package Seminars.Ex003_School;

public class JuniorSchoolkid extends Schoolkid implements Playable{

    @Override
    public void study() {
        System.out.println("Я люблю учиться");
    }

    public void goToAfterSchool() {
        System.out.println("Я хожу на продлёнку");
    }

    public void play() {
        System.out.println("Я играю в игры");
    }

    @Override
    public String toString() {
        return "Начальный класс:";
    }
    
}
