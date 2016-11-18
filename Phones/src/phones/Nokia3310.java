/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phones;

/**
 *
 * @author new
 */
public class Nokia3310 extends Phone {
    public Nokia3310(){
        System.out.println("Nokia3310 constructor");
        
        touch = false;
        hasWifi = false;
        screenSize = 2;
    }
    
    @Override
    public void call(String number){
        super.call(number);
        System.out.println("Nokia3310 class is calling " + number);
    }
    
    @Override
    public void sendSMS(String number, String message){
        System.out.println("Nokia3310 is calling " + message + "to " + number);
    }
}
