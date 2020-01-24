import java.lang.*;
import java.util.*;
class WordCount
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
         int count=0;  
         System.out.println("Enter the string");
       String string = sc.nextLine();
      
            char ch[]= new char[string.length()];     
            for(int i=0;i<string.length();i++)  
            {  
                ch[i]= string.charAt(i);  
                if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                    count++;  
            }  
            System.out.println("no.of words in the above string is "+count);
    }
}