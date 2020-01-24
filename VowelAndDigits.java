import java.lang.*;
import java.util.*;
class VowelAndDigits
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
         int vowels=0,digits=0;  
         System.out.println("Enter the string");
       String line = sc.nextLine();
    line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            
            else if( ch >= '0' && ch <= '9')
            {
                ++digits;
            }
            
        }
System.out.println("no.of vowels in the above string: "+vowels+"\nno.of digits in the string: "+digits);
}
}