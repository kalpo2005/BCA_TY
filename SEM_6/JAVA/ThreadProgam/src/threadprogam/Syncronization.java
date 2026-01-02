/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadprogam;

public class Syncronization {

    synchronized void printTable(int number) {
        System.out.println(" \nTable of number" + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Syncronization obj = new Syncronization();
        Thread t = new Thread() {
            @Override
            public void run() {
                obj.printTable(5);
            }

        };
        t.start();

        Thread t2 = new Thread() {
            @Override
            public void run() {
                obj.printTable(10);
            }

        };
        t2.sleep(2000);
        t2.start();
    }
}
