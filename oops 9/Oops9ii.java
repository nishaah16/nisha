/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops9ii;

/**
 *
 * @author pc
 */
public class Oops9ii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            int n1=1,n2=0;
            int output=n1/n2;
            System.out.println("Result:"+output);
        }
        catch(ArithmeticException e1)
        {
            System.out.println("divided a number by zero");
        }
        try
        {
            int arr[]=new int[5];    //Array has only 5 elements            
            arr[6]=7;
        }
        catch(ArrayIndexOutOfBoundsException e2)
        {
            System.out.println("Array Index Out Of Bounds");
        }
        try
        {
            int number=Integer.parseInt("ABC");
            System.out.println(number);
        }
        catch(NumberFormatException e3)
        {
            System.out.println("Number format exception occurred");
        }
        try
        {
            String str="objectorientedprogram";
            System.out.println("length of string:"+str.length());;
            char c=str.charAt(0);
            c=str.charAt(50);
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e4)
        {
            System.out.println("String Index Out Of Bounds Exception");
        }
        // TODO code application logic here
    }    
}