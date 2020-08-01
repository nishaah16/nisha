/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author nisha
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        // TODO code application logic here
    box1 obj=new box1();
    System.out.println("depth"+obj.depth);
    System.out.println("height"+obj.height);
    System.out.println("width"+obj.width);
    obj.volume();
    
    
    
    box1 obj1=new box1(10,20,30);
    System.out.println("depth"+obj1.depth);
    System.out.println("height"+obj1.height);
    System.out.println("width"+obj1.width);
    obj1.volume();
    
    
    }
}
class box1
{ 
    double height;
    double width;
    double depth;
    box1()
    {
        System.out.println("inside constructor");
        height=10;
        width=20;
        depth=30;
    }



    box1(double h,double w,double d)
    {      
         System.out.println("second constructor");
         height=h;
         width=w;
         depth=d;
    }
    void volume()
    {
        System.out.println("volume is:"+(height*width*depth));
    }        
}    
        
    
    

