/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadAssign2 extends Thread {

    public void print() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Prin Nuber : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadAssign2.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}

public class Assign2 {

    public static void main(String[] args) {

        ThreadAssign2 th = new ThreadAssign2();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                th.print();
            }
        };

        t1.start();
        try {
            t1.join();

        } catch (InterruptedException ex) {
            Logger.getLogger(Assign2.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Main Thread done !!!");
    }
}
