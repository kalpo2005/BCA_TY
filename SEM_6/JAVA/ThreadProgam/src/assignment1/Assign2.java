/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

class ThreadAssign2 {

    void print() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number : " + i);
        }
    }

}

public class Assign2 extends Thread {

    public static void main(String[] args) throws InterruptedException {

        ThreadAssign2 kal = ThreadAssign2();

        Thread th;
        th = new Thread() {
            @Override
            public void run() {
                kal.print();
            }
        };

        Thread th2 = new Thread() {
            @Override
            public void run() {
                kal.print();
            }
        };
        
        th.start();
        th.join(5000);
        th2.start();

    }

    private static ThreadAssign2 ThreadAssign2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
