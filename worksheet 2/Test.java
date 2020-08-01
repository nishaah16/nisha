/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author nisha
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        customer obj=new customer(101,"nisha",20);
        System.out.println(obj.getid());
        System.out.println(obj.getname());
        System.out.println(obj.getdiscount());
        System.out.println("after seeing discount");
        obj.setdiscount(30);
        System.out.println(obj.getdiscount());
        System.out.println(obj);
        
        System.out.println("\ninvoices:");
        invoice obj1=new invoice(100,obj,2000);
        customer c2=new customer(102,"bbb",10);
        System.out.println("id :"+obj1.getid());
        System.out.println("\ncustomer details\n"+obj1.getcustomer());
        System.out.println("amount:"+obj1.getamount());
        obj1.setamount(1500);
        obj1.setcustomer(c2);
        System.out.println(obj1.getamount());
        System.out.println("name:"+obj1.getcustomername());
        System.out.println(obj1.getamountafterdiscount());
        
        
        
        // TODO code application logic here
    }
       
}
class customer
{
    int id;
    String name;
    int discount;
    customer(int i,String n,int d)
    {
        id=i;
        name=n;
        discount=d;
    }       
    int getid()
    {
        return id;
    }        
    String getname()
    {
        return name;
        
    }        
    int getdiscount()
    {
        return discount;
    }        
    void setdiscount(int d1)
    {
        discount=d1;
    }

    public String tostring()
    {        
        return "id:"+id+"\nname :"+name+"\ndiscount :"+discount;
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
    
    int getid()
    {
        return id;
        
    }   
    customer getcustomer()
    {
        return o;
    }        
    void setcustomer(customer o2)
    {
        o=o2;
    }        
    double getamount()
    {
        return amount;
        
    }
    void setamount(int a1)
    {
        amount=a1;
    }
      
    String getcustomername()
    {
        return o.name;
    }        
    
    double getamountafterdiscount()
    {
        return amount-(amount)*o.discount/100;
    }        
}
