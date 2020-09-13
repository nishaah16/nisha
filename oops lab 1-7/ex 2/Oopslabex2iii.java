/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex2iii;
import java.util.Scanner;
/**
 *
 * @author nisha
 */
public class Oopslabex2iii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
     int a,b;
     System.out.println("enter a");
     a=obj.nextInt();
     System.out.println("enter b");
     b=obj.nextInt();
     art ob=new art();
     System.out.println(ob.add(a,b));
     System.out.println(ob.sub(a,b));
     System.out.println(ob.mul(a,b));
     System.out.println(ob.div(a,b));
        // TODO code application logic here
    }
    
}
class art
{    
     int add(int a,int b)
     {
        return a+b;
    }
    int sub(int a,int b)
    {
        return a-b;
    }
    int mul(int a,int b)
    {
        return a*b;
    }
    int div(int a,int b)
    {
       return a/b; 
    }
}