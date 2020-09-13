/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex2ii;

/**
 *
 * @author nisha
 */
public class Oopslabex02ii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        box01 obj=new box01();
        System.out.println(obj.depth);
        box01 obj1=new box01(10,20,30);
        System.out.println(obj1.depth);
        
        // TODO code application logic here
    }
    
    
}

class box01
{
    double height;
    double width;
    double depth;
    box01()
    {
        System.out.println("first obj");
        height=10;
        width=20;
        depth=30;
    }
    box01(double h,double w,double d)
    {
        System.out.println("second obj");
        height=h;
        depth=d;
        width=w;
    }
}