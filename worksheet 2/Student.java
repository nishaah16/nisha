/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author nisha
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        student1 obj[]=new student1[10];
         for (int i = 0; i < 10; i++)
         {
             obj[i]=new student1();
             obj[i].getdata();
             obj[i].markcal();
             obj[i].display();
         }
         
         
    }    
    
}
class student1
{
    String name;
    String dept,status;
    double avg,m1,m2,m3;
    
    void getdata()
  {
  Scanner obj = new Scanner(System.in);
      System.out.println("enter the name,dept and 3marks ");
  name=obj.next();
  dept=obj.next();
  m1=obj.nextDouble();
  m2=obj.nextDouble();
  m3=obj.nextDouble();
  }
    void markcal()
    {
        avg=(m1+m2+m3)/3;
        if(m1<50 || m2<50 || m3<50)
        {
            status="fail";
        }
        else
        {
            if(avg>=80)
                status="first class";
            if(avg>=70)
                status="second class";
            if(avg>=50 && avg<=69)
                status="third class";
        }   
    }    
    void display()
    {
         System.out.println("name :"+name+"\ndep :t"+dept+"\nm1 :"+m1+"\nm2 :"+m2+"\nm3 :"+m3+"\naverage :"+avg+"status :"+status);
    }
} 
