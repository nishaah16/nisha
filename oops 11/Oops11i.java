/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops11i;
import java.lang.*;
/**
 *
 * @author nisha
 */
public class Oops11i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        threadtest t1=new threadtest();        
        threadtest t2=new threadtest();        
        threadtest t3=new threadtest();        
        t1.setName("a");
        t2.setName("b");
        t3.setName("c");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);        
        t3.setPriority(6);
        t1.start();
        t2.start();
        t3.start();
        // TODO code application logic here
    }
    
}

class threadtest extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Thread name: "+Thread.currentThread().getName());
        System.out.println("Thread priority: "+Thread.currentThread().getPriority());
    } 

}