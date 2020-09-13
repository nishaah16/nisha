/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex2iv;

import java.util.Scanner;

/**
 *
 * @author nisha
 */
public class Oopslabex2iv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student obj[]=new student[10];
        for(int i=0;i<2;i++)
        {
            obj[i]=new student();
            obj[i].getdata();
            obj[i].markcal();
            obj[i].display();
        }
        // TODO code application logic here
    }
    
}
class student
{
    String name,dept,status;
    double mark1,mark2,mark3,avg;
    void getdata()
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name :");
        name=obj.next();
        System.out.println("Enter the dept :");
        dept=obj.next();
        System.out.println("Enter mark :");
        mark1=obj.nextDouble();
        mark2=obj.nextDouble();
        mark3=obj.nextDouble();
    }
    void markcal()
    {
        avg=(mark1+mark2+mark3)/3;
        if(mark1<50||mark2<50||mark3<50)
        {
            status="FAIL";
        }
        else{
            if(avg>=80)
                status="First Class";
            if(avg>=70&&avg<=79)
                status="Scond Class";
            if(avg>=50&&avg<=69)
                status="Tird Class";
        }
    }
    void display()
    {
        System.out.println("Name:"+name+"\nDept:"+dept+"\nM1:"+mark1+"\nM2"+mark2+"\nM3"+mark3+"\nAverage:"+avg+"\nStatus:"+status);
    }
}
