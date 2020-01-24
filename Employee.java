import java.util.*;
import java.lang.*;
class Employee
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

//System.out.println("emp_salaries:");
for(int i=0;i<args.length;i++)  
{
System.out.println(args[i]);
}//
System.out.println("emp_id");
  int a[]=new int[3];
a[0]=1;
a[1]=2;
a[2]=3;
for(int i=0;i<a.length;i++){ 
System.out.println(a[i]);  }
String[] array = new String[2];

        System.out.println("Enter emp_names:");              
        
        for (int i = 0; i <array.length; i++) {
        array[i] = sc.nextLine();
System.out.println("emp_name of "+(i+1)+" is "+array[i]);
    }



  
       // System.out.println(array[0]);

    }

}
