/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops11ii;

/**
 *
 * @author nisha
 */
public class Oops11ii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Ordering order=new Ordering();//LINEA
        Item thread1=new Item(order,5);//LINEB
        thread1.start();
        Item thread2=new Item(order,4);
        thread2.start();
        Item thread3=new Item(order,2);
        thread3.start();
        // TODO code application logic here
    }
    
}
class Ordering
{
    static int availableItems=10;
    synchronized void orderItem(int requestedItems)//LINED
    {
        System.out.println(Thread.currentThread().getName()+" entered... ");
        System.out.println(" Available items: "+availableItems+" Requested items :"+requestedItems);        
        if(availableItems>=requestedItems)
        {
            System.out.println("  Items are Available.order now...)");
            System.out.println(requestedItems+" items ordered... ");
            availableItems=availableItems-requestedItems;
        }
        else
        {
            System.out.println(" sorry,Requested items not available... ");
        }
        System.out.println(Thread.currentThread().getName()+" leaving... ");        
     }
}
class Item extends Thread
{
    Ordering order;
    int requestedItems;
    public Item(Ordering order,int requestedItems)
    {
        this.order=order;
        this.requestedItems=requestedItems;
    }
    @Override
    public void run()//LINEC
    {
        order.orderItem(requestedItems);
}
}
