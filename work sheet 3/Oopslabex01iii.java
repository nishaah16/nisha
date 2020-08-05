/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex01iii;

import java.util.Scanner;

/**
 *
 * @author nisha
 */
public class Oopslabex01iii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int temp,year,week,day;
        Scanner S = new Scanner(System.in);
        System.out.println("enter days:");
        temp=S.nextInt();
        year=temp/365;
        temp=temp%365;
        System.out.println("years:"+year);
        week=temp/7;
        temp=temp%7;
        System.out.println("weeks:"+week);
        day=temp;
        System.out.println("days:"+day);
               
        
        // TODO code application logic here
    }
    
}