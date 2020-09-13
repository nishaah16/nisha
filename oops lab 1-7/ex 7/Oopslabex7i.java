/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex7i;
import java.util.*;
import java.io.*;
/**
 *
 * @author nisha
 */
public class Oopslabex7i
{

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)  throws IOException
    {
        ArrayList<String> obj = new ArrayList<>();
        DataInputStream in=new DataInputStream(System.in);
        int c,ch;
        int i,j;
        String str,str1;
        do
        {
            System.out.println("STRING MANIPULATION");
            System.out.println("************************");
            System.out.println("1. Append at end");
            System.out.println("2.Insert at particular index");
            System.out.println("3.Search ");
            System.out.println("4. List string that starting with letter");
            System.out.println("5.Size");
            System.out.println("6.Remove");
            System.out.println("7.Sort" );
            System.out.println("8.Display" );
            System.out.println("Enter the choice ");
            c=Integer.parseInt(in.readLine());
            switch(c)
            {
                case 1:
                {
                    System.out.println("Enter the string ");
                    str=in.readLine();
                    obj.add(str);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the string ");
                    str=in.readLine();
                    System.out.println("Specify the index/position to insert");
                    i=Integer.parseInt(in.readLine());
                    obj.add(i-1,str);
                    System.out.println("The array list has following elements:"+obj);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the string to search ");
                    str=in.readLine();
                    j=obj.indexOf(str);
                    if(j==-1)
                        System.out.println("Element not found");
                    else
                        System.out.println("Index of:"+str+" is "+j);
                    break;
                }
                case 4:
                {
                    System.out.println("Enter the character to List string that starts with specified character");            
                    str=in.readLine();
                    for(i=0;i<(obj.size()-1);i++)
                    {
                        str1=obj.get(i);
                        if(str1.startsWith(str))
                        {
                            System.out.println(str1);
                        }
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("Size of the list "+obj.size());
                    break;
                }
                case 6:
                {
                    System.out.println("Enter the element to remove");
                    str=in.readLine();
                    if(obj.remove(str))
                    {
                        System.out.println("Element Removed"+str);
                    }
                    else
                    {
                        System.out.println("Element not present");
                    }
                    break;
                }
                case 7:
                {
                    Collections.sort(obj);
                    System.out.println("The array list has following elements:"+obj);
                    break;
                }
                case 8:
                {
                    System.out.println("The array list has following elements:"+obj);
                    break;
                }
            }
            System.out.println("Please Enter 0 to break and 1 to continue");
            ch=Integer.parseInt(in.readLine());
        }while(ch==1);
    // TODO code application logic here
    }
}    