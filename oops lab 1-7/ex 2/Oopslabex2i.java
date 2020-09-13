/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex2i;

/**
 *
 * @author pc
 */
public class Oopslabex2i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double vol;
        box obj=new box();
        obj.depth=1;
        obj.height=4;
        obj.width=5;
        vol=obj.depth*obj.height*obj.width;
        System.out.println("volume "+vol);
        // TODO code application logic here
    }
    
}
class box{
    double depth;
    double height;
    double width;
    public void volume(){
        double vol;
        vol=depth*height*width;
        System.out.println("volume"+vol);
    }
}
