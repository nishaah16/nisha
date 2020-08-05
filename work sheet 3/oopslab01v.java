/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex01v;

import java.util.Scanner;

/**
 *
 * @author nisha
 */
public class Oopslabex01v {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count=0;
        Scanner t=new Scanner(System.in);
        System.out.println("enter no:");
        int no=t.nextInt();
        while(no>0)
        {
            no=no/10;
            count=count+1;
            
            
        }
        System.out.println("no. of digits:"+count);
// TODO code application logic here
    }
    
}