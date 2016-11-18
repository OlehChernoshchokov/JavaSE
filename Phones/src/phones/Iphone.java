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
public class Iphone extends Phone{
    protected imei;
    public Iphone(){
        System.out.println("Iphone constructor");
        
        touch = true;
        hasWifi = true;
        screenSize = 3;
    }
    
    @Override
    public void call(String number){
        super.call(number);
        System.out.println("Iphone class is calling " + number);
    }
    
    @Override
    public void sendSMS(String number, String message){
        System.out.println("Iphone is calling " + message + "to " + number);
    }
}
