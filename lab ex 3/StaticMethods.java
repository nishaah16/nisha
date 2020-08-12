import java.util.*;
public class StaticMethods {
    static int staticcounter=0;
    public static void main(String[] args) {
       
        int []array1=new int[10];
        int []array2=new int[10];
        int n,m,i;
        int counter=0;
       
        Scanner obj=new Scanner(System.in);
        System.out.println("enter length of array 1 and array 2");
        n=obj.nextInt();
        m=obj.nextInt();
       
        System.out.println("enter elements of array 1(length="+n+")");
        for(i=0;i<n;i++)
          array1[i]=obj.nextInt();
       
        System.out.println("enter elements of array 2(length="+m+")");
        for(i=0;i<m;i++)
          array2[i]=obj.nextInt();
       
        System.out.println(equal(array1,array2));//
       
        System.out.println("enter A and N value");
        int A=obj.nextInt();
        int N=obj.nextInt();
        System.out.println("mod of A and N is: "+mod(A,N));
       
        increament(counter);
        increament(counter);
        System.out.println("static variable after increamenting twice: "+staticcounter);
        System.out.println("Non-static variable after increamenting twice: "+counter);
       
    }
    static void increament(int counter){
        staticcounter+=1;
        counter+=1;
    }
    static int mod(int a,int n){
      return a%n;
    }
   
    static String equal(int a[],int b[]){
        int i,flag=0;
        if(a.length!=b.length)
            return "False";
        else{
           
        for(i=0;i<a.length;i++)
        {
            if(a[i]==b[i])
                continue;
            else
                flag=1;
                 break;
        }
        }
       if (flag!=1)
           return "True";
       else
           return "false";
    }
   
     

}