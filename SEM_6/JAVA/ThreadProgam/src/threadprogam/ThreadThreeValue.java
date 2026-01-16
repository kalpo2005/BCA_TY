/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadprogam;

/**
 *
 * @author ABC
 */
class PrintValue extends Thread {
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Value is a : " + i);
        }
    }
    
}

public class ThreadThreeValue {

    public static void main(String[] args) throws InterruptedException {
        
        PrintValue obj = new PrintValue();
        PrintValue obj2 = new PrintValue();
        PrintValue obj3 = new PrintValue();
        
        System.out.println("Thread first is alive : " + obj.isAlive());
        
        System.out.println("\n First Thred !!!");
        obj.start();
        obj.join();
        System.out.println("Thread first is alive : " + obj.isAlive());
        System.out.println(obj.getName());
//        obj.setName("Kalpesh Thread !!!");
//        obj.getName();
        
        System.out.println("\n Second Thred !!!");
        obj2.start();
        obj2.join();
        
        obj3.start();
    }
        System.out.println("\n Third Thred !!!");
}
