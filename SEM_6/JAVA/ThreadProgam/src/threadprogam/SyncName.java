/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadprogam;



public class SyncName {
    
    synchronized void showName(String name){
        System.out.println("Your Friend Name is a : "+ name);
    }
    
    public static void main(String[] args) throws InterruptedException {
        
        SyncName obj = new SyncName();
        
        Thread th = new  Thread(){
            @Override
            public void run() {
               obj.showName("Kalpesh Bavaliya");
            }
        };
        th.start();
        
        Thread th2 = new  Thread(){
            @Override
            public void run() {
               obj.showName("Anil Baraiya");
            }
        };
        
        th2.sleep(2000);
        th2.start();
        
        Thread th3 = new  Thread(){
            @Override
            public void run() {
               obj.showName("Dhruv Degama");
            }
        };
        th3.sleep(2000);
        th3.start();
    }
    
}
