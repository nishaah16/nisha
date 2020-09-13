/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopslabex8ii;
import java.util.*;
import static oopslabex8ii.roigi.a;
/**
 *
 * @author nisha
 */
public class Oopslabex8ii {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String str="ABC";
        System.out.printf("All permutations with"+" repetition of %s are:\n",str);
        a(str);
        // TODO code application logic here
    }    
}
class roigi
{
static void b(String str,char[]data,int last,int index)
{
    int length=str.length();
    for(int i=0;i<length;i++)
    {
        data[index]=str.charAt(i);
        if(index==last)
            System.out.println(new String(data));
        else
            b(str,data,last,index+1);
    }
}
public static void a(String str)
{
    int length=str.length();
    char[] data=new char[length+1];
    char[] temp=str.toCharArray();
    Arrays.sort(temp);
    str=new String(temp);
    b(str,data,length-1,0);
}
}
© 2020 GitHub, Inc.
