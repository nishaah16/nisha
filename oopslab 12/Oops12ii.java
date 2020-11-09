/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops12ii;

import static jdk.nashorn.internal.objects.NativeMath.min;
public class Oops12ii {
/**
 *
 * @author nisha
 */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("minimum of nos  "+min(Integer.valueOf(5),Integer.valueOf(3),Integer.valueOf(7)));
        System.out.println("minimum of nos  "+min(Double.valueOf(5.6),Double.valueOf(2.4),Double.valueOf(6.8)));
        System.out.println("minimum of string "+min(" stick "," meat "," leather "));
        // TODO code application logic here
    }
    
    
}

public static<T extends Comparable<T>>T min(T ...elements)
{
    T min=elements[0];
    for(T element : elements)
    {
        if(element.compareTo(min)<0)
        {
            min=element;
        }            
}