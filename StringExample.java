import java.util.*;
import java.lang.*;
class StringExample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //initialize the string
        String name ="This is a string";

        //string object creation
        String empid=new String();

        //create char array and convert it to string
        char[] designation={'I','T'};
        String desig = new String(designation);
System.out.println("Enter the string");
       String emp_name = sc.nextLine();

       System.out.println("\n"+emp_name);
    }
}