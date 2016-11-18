package phones;

public class MainClass {

    public static void main(String[] args) {

        Nokia3310 nokia = newNokia3310();
        System.out.println("Nokia3310 screen size: " + nokia.getScreensize());
        nokia.call("123-45-67");
        nokia.sendSMS("567-78-89", "text message");

        System.out.println("---------------------------------");

        Iphone iphone = new Iphone();
        System.out.println("Iphone screen size: " + iphone.getScreenSize());
        iphone.call("123-45-67");
        iphone.sendSMS("567-78-89", "text message");

        System.out.println("---------------------------------");
            
        Iphone5 iphone5 = new Iphone5();
        System.out.println("Iphone5 screen size: " + iphone5.getScreenSize());
        iphone5.call("123-45-67");
        iphone5.sendSMS("567-78-89", "text message");
    }

}
