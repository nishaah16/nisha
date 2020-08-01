/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxclass;

/**
 *
 * @author nisha
 */
public class Boxclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {            
      box1 obj=new box1();
      obj.depth=10;
      obj.height=20;
      obj.width=30;
      double vol=obj.depth*obj.height*obj.width;
        System.out.println("volume"+vol);
      
    }
    
}
 class box1
 {
     int depth;
     int height;
     int width;
 }
