package assignment1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABC
 */
public class Assign3 {

    synchronized void printTable(int num) {
        System.out.println("Table of : " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }

    public static void main(String[] args) {
        Assign3 kal = new Assign3();

        Thread t1 = new Thread() {
            @Override
            public void run() {
                kal.printTable(5);
            }
        };
         t1.start();
        
         Thread t2 = new Thread() {
            @Override
            public void run() {
                kal.printTable(10);
            }
        };
         
         t2.start();
    }
}
