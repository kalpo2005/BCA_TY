/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadprogam;

class HelperPrint extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
               System.out.println("My First Thread Program !!! : " + i);
        }
    }

}

public class PrintNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       HelperPrint helper = new HelperPrint();
       HelperPrint helper2 = new HelperPrint();
       HelperPrint helper3 = new HelperPrint();
       
       System.out.println("First Time Print !!!");
       helper.start();
       helper2.sleep(3000);
       System.out.println("Second Time Print !!!");
       helper2.start();
       helper3.sleep(3000);
       System.out.println("Third Time Print !!!");
       helper3.start();
    }

}
