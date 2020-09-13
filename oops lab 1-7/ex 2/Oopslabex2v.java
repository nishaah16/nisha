/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex2v;

/**
 *
 * @author nisha
 */
public class Oopslabex2v {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        customer obj=new customer(1,"customer1",20);
        System.out.println(obj.getid());
        System.out.println(obj.getname());
        System.out.println(obj.getdisc());
        System.out.println("INVOICE");
        obj.setdisc(30);
        System.out.println(obj.getdisc());
        System.out.println(obj);
        
        invoice in=new invoice(101,obj,2000);
        customer c2=new customer(2,"customer2",20);
        System.out.println(in.getcustomer());
        System.out.println(in.getamount());
        in.setcustomer(c2);
        System.out.println(in.getcustomername());
        System.out.println(in.getamountafterdis());
        
        
        // TODO code application logic here
    }
    
}
class customer
{
    int id;
    String name;
    int dis;
    customer(int i,String n,int d)
    {
        id=i;
        name=n;
        dis=d; 
    }
    int getid()
    {
        return id;
    }
    String getname()
    {
        return name;
    }
    int getdisc()
    {
        return dis;
    }
    void setdisc(int d1)
    {
        dis=d1;
    }
    public String toString()
    {
        return "ID:"+id+"\nName:"+name+"\nDiscount:"+dis;
    }
    
    
}
class invoice
{
    int id;
    customer o;
    double amount;
    invoice(int i,customer o1,double a)
    {
        id=i;
        o=o1;
        amount=a;
    }
    customer getcustomer()
    {
        return o;
    }
    void setcustomer(customer o2)
    {
        o=o2;
    }
    int getdata()
    {
        return id;
    }
    double getamount()
    {
        return amount;
    }
    double setamount()
    {
        return amount;
    }
    void setamount(double d)
    {
        amount=d;
    }
    String getcustomername()
    {
        return o.name;
    }
    double getamountafterdis()
    {
        return amount-(amount)*o.dis/100;
    }

    
}