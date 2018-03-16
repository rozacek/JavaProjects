package emailapp;

public class EmailApp {

    public static void main(String[] args) {
        Email eml1 = new Email("John", "Smith");
        eml1.setAlternateEmail("rozacek@rozacek.com");
        System.out.println(eml1.showInfo());
    }
}
