  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex8i;
import java.util.Scanner;
/**
 *
 * @author nisha
 */
public class Oopslabex8i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner s=new Scanner(System.in);
        System.out.print("enter no:");
        n=s.nextInt();
        String names[]=new String[n];
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter names:");
        for(int i=0;i<n;i++)
        {
            names[i]=s1.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(names[i].compareTo(names[j]) >0)
                {
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;
                }
            }
        }
        System.out.print("sorted names:\n");
        for(int i=0;i<n-1;i++)
        {
            System.out.println(names[i]);
        }
        System.out.println(names[n-1]);
        // TODO code application logic here
    }
}
