/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arith;
import java.util.Scanner;

/**
 *
 * @author divya
 */
public class Arith {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       art obj=new art();
       Scanner obj1=new Scanner(System.in);
        System.out.println("enter a and b value:");
       int a=obj1.nextInt();
       int b=obj1.nextInt();
        System.out.println("add :"+obj.add(a,b));
        System.out.println("sub :"+obj.sub(a,b));
        System.out.println("mul :"+obj.mul(a,b));
        System.out.println("div :"+obj.div(a,b));
    }
    
}
class art
{
    

int add(int a,int b)
{
return a+b;
}
int sub(int a,int b)
{
return a-b;
}
int mul(int a,int b)
{
return a*b;
}
int div(int a,int b)
{
return a/b;
}
}
