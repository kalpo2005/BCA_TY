/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

class ThreadTest extends Thread {

    @Override
    public void run() {
        System.out.println("Thread Name : " + this.getName());
    }

}

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Name : " + Thread.currentThread().getName());
    }

   
}

public class Assign1 {

    public static void main(String[] args) {

        ThreadTest test = new ThreadTest();
        ThreadDemo demo = new ThreadDemo();

        test.start();
        test.setName("First Thread");

       Thread  th = new Thread(demo);
       th.start();
       th.setName("Second Thread !!!");
    }
}
