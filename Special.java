import java.util.*;
import java.lang.*;
class Special
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
         int count=0;
         System.out.println("Enter the string");
       String line = sc.nextLine();
line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
           
           if (ch >= 'A' && ch <= 'Z') ;
                //upper++; 
            else if (ch >= 'a' && ch <= 'z') ;
                //lower++; 
            else if (ch >= '0' && ch <= '9') ;
                //number++; 
            else
                count++; 
        }
        System.out.println("no.of special characters in above string are:"+count);
    }
}