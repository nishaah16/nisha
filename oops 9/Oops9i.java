/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops9i;
import java.io.*;
/**
 *
 * @author nisha
 */
public class Oops9i 
{

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int no,a;
        String n,dep;
        System.out.println("Enter id");
        no=Integer.parseInt(br.readLine());
        System.out.println("Enter name");
        n=br.readLine();
        System.out.println("Enter age");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter department");
        dep=br.readLine();
        Doctor d=new Doctor(no,n,a,dep);
        d.display();
        // TODO code application logic here
    }        
}
class AgeNotWithInRangeException extends Exception
{
    public String toString()
    {
        return("Age is not between 25 and 65… Please ReEnter the Age");        
    }
}
class NameNotValidException extends Exception 
{
    public String validname()
    {
        return("Name is not Valid… Please ReEnter the Name");        
    }
}
class Doctor
{
    int id,age;
    String name,department;
    Doctor()
    {
        id=0;
        name=null;
        age=0;
        department=null;
    }
    Doctor(int no, String n, int a, String dep)
    {
        id=no;        
        department=dep;
        int len,temp=0;
        len=n.length();
        for(int i=0;i<len;i++)
        {
            char ch;
            ch=n.charAt(i);
            if(ch<'A'|| ch>'Z'&& ch<'a'||ch>'z')
                temp=1;
        }
//CheckingName
        try
        {
            if(temp==1)
                throw new NameNotValidException();
            else
                name=n;
        }
        catch(NameNotValidException e2)
        {
            System.out.println(e2);
        }
/*———-CheckingAge——————–*/
        try
        {
            if(a>=25 && a<=65)
                age=a;
            else
                throw new AgeNotWithInRangeException();
        }
        catch(AgeNotWithInRangeException e1)
        {
            System.out.println(e1);
        }
    }    

    void display()
    {
        System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("department:"+department);        
    }
}