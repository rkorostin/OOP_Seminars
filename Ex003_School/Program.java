package Seminars.Ex003_School;

public class Program {
    public static void main(String[] args) {
        Schoolkid[] schoolkids = { new JuniorSchoolkid(), new MiddleSchoolkid(), new HigthSchoolkid() };

        for (Schoolkid schoolkid : schoolkids) {
            printInfoSchoolkids(schoolkid);
        }

    }

    public static void printInfoSchoolkids(Schoolkid schoolkids) {
        System.out.println(schoolkids);
        schoolkids.study();

        if (schoolkids instanceof JuniorSchoolkid) {
            JuniorSchoolkid schoolkid = (JuniorSchoolkid) schoolkids;
            schoolkid.play();
            schoolkid.goToAfterSchool();
        }

        if (schoolkids instanceof MiddleSchoolkid) {
            MiddleSchoolkid middlSchoolkid = (MiddleSchoolkid) schoolkids;
            middlSchoolkid.play();
            middlSchoolkid.smoke();
        }

        if (schoolkids instanceof HigthSchoolkid) {
            HigthSchoolkid higthSchoolkid = (HigthSchoolkid) schoolkids;
            higthSchoolkid.smoke();
            higthSchoolkid.isLove();
        }

    }
}
