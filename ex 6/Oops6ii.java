/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops6ii;

import java.util.Scanner;

/**
 *
 * @author nisha
 */
interface creditcardinterface
{
    public void viewcreditamount();
    public void viewpin();
    public void changepin();
    public void paybalance();
}
class customer implements creditcardinterface
{
    String name;
    int cardnumber;
    int pin;
    int creditamount=0;
    customer(int no, String n,int p,int amt)
    {
        name=n;
        cardnumber=no;
        pin=p;
        creditamount=amt;
    }
    public void viewcreditamount()
    {
        
    }
    public void viewpin(){
        
    }
    public void changepin(int i){
        System.out.println("enter new pin for customer"+i+1);
        Scanner a=new Scanner(System.in);
        int newpin=a.nextInt();
    }
    public void paybalance(int i){
        System.out.println("pay balance amount for customer"+i+1);
        Scanner b=new Scanner(System.in);
        int paybal=b.nextInt();
    }    

    @Override
    public void changepin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paybalance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
public class Oops6ii {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        customer[] obj = new customer[3];
        obj[0]=new customer(1234,"ram",1111,500);
        obj[1]=new customer(1235,"ra",2222,50);
        obj[2]=new customer(1236,"r",3333,5);
        for(int i=0;i<3;i++)
        {
            obj[i].paybalance(i);
            obj[i].changepin(i);
        }   // TODO code application logic here
    }
}
