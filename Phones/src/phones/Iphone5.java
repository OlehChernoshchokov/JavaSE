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
public class Iphone5 extends Phone{
    public Iphone5(){
        System.out.println("Iphone constructor");
        
        touch = true;
        hasWifi = true;
        screenSize = 4;
        imei = "111111111";
    }
    
    @Override
    public void call(String number){
        System.out.println("Iphone5 class is calling " + number);
    }
    
    @Override
    public void sendSMS(String number, String message){
        super.sendSMS(number, message);
        System.out.println("Iphone5 is calling " + message + "to " + number);
    }
}
