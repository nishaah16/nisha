/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oops12i;
import java.util.Arrays;
/**
 *
 * @author nisha
 */
public class Oops12i {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length=5;
        Array<Integer>intArray=new Array(Integer.class,length);
        for(int i=0;i<length;i++)
        intArray.set(i,i+1);
        System.out.println(intArray);
        Array<String>strArray=new Array(String.class,length);
        for(int i=0;i<length;i++)
        strArray.set(i,String.valueOf((char)(i+65)));
        System.out.println(strArray);
        System.out.println(insertatstart());
        System.out.println(insertatmid());
        System.out.println(insertatend());
        System.out.println(deleteatn());
        
        // TODO code application logic here
    }
    
}

class Array<E>
{
    E[]arr;
    public int length;
    public Array(Class<E>type,int length)
    {
        this.arr=(E[])java.lang.reflect.Array.newInstance(type,length);
        this.length=length;
    }
    E get(int i)
    {
        return arr[i];
    }
    void set(int i,E e)
    {
        arr[i]=e;
    }
    void insertatstart(E start)
    {
        arr[0]=start;
    }
    void insertatmid(E mid)
    {
        arr[length/2]=mid;
    }
    void insertatend(E end)
    {
        arr[length-1]=end;
    }
    @Override
    public String toString()
    {        
        return Arrays.toString(arr);
    }
}

