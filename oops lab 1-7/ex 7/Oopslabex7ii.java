/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex7ii;
import java.util.*;
/**
 *
 * @author nisha
 */
public class Oopslabex7ii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Student> ar=new ArrayList<>();                        
        ar.add(new Student(6,"f",10));
        ar.add(new Student(7,"g",10));
        ar.add(new Student(8,"h",10));
        ar.add(new Student(9,"i",10));
        ar.add(new Student(10,"j",10));
        ar.add(new Student(1,"a",10));
        ar.add(new Student(2,"b",10));
        ar.add(new Student(3,"c",10));
        ar.add(new Student(4,"d",10));
        ar.add(new Student(5,"e",10));
        ar.add(new Student(16,"p",10));
        ar.add(new Student(17,"q",10));
        ar.add(new Student(18,"r",01));
        ar.add(new Student(19,"s",10));
        ar.add(new Student(20,"t",10));
        ar.add(new Student(11,"k",10));
        ar.add(new Student(12,"l",10));
        ar.add(new Student(13,"m",10));
        ar.add(new Student(14,"n",10));
        ar.add(new Student(15,"o",10));        
        System.out.println("Unsorted");
        for(int i=0;i<ar.size();i++)
            System.out.println(ar.get(i));
        Collections.sort(ar,new Sortbyroll());
        System.out.println("\nSorted by roll no.");
        for(int i=0;i<ar.size();i++)
            System.out.println(ar.get(i));        
        // TODO code application logic here
    }
    
}
class Student
{
int rollno,cgpa;
String name;
    public Student(int rollno,String name,int cgpa)    
    {
        this.rollno=rollno;
        this.name=name;
        this.cgpa=cgpa;
    }
@Override
    public String toString()
    {
        return this.rollno+"  "+this.name+"  "+this.cgpa;
    }
}
class Sortbyroll implements Comparator<Student>
{
    @Override
    public int compare(Student a,Student b)
    {
        return a.rollno-b.rollno;
    }
}
