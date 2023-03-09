package Seminars.Ex003_School;

public class HigthSchoolkid extends Schoolkid implements Smoke {

    @Override
    public void smoke() {
        System.out.println("Я бросаю курить");
    }

    public void isLove() {
        System.out.println("Я ищу себе пару");
    }

    @Override
    public void study() {
        System.out.println("Я должен учиться");
    } 
    
    @Override
    public String toString() {
        return "Старший класс:";
    }
    
}
