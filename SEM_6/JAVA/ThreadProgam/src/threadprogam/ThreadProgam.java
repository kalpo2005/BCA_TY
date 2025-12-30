/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadprogam;

class HelperClass extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
               System.out.println("My First Thread Program !!! : " + i);
        }
    }

}

public class ThreadProgam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HelperClass helper = new HelperClass();
       HelperClass helper2 = new HelperClass();
       HelperClass helper3 = new HelperClass();
       
       helper.start();
    }

}
