/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadprogam;

import java.util.logging.Level;
import java.util.logging.Logger;

class JoinHelper extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(JoinHelper.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Loop run times : " + i);
        }
    }
    
}

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        
        JoinHelper helper = new JoinHelper();
        JoinHelper helper2 = new JoinHelper();     
//        JoinHelper helper3 = new JoinHelper();
        
        System.out.println("\n First Thread started !!!");
        helper.start();
        helper.join(2525);
        System.out.println("\n Second Thread stared !!!");
        helper2.start();
//        helper3.start();
        
    }
}
