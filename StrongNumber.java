import java.util.*;
class StrongNumber
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

int num,temp,sum=0,reminder;
System.out.println("Enter a value:");
num=sc.nextInt();
temp = num;
while( temp > 0)
		
{
			
int factorial = 1; 
int i = 1; 
reminder = temp % 10;
while (i <= reminder)
{
		     	
factorial = factorial * i;
		     	
i++;
		   
 }
		    
//System.out.println(" The Factorial of " + reminder + "  =  " + factorial);
		     sum = sum + factorial;
		     temp = temp /10;
		}
if(sum==num)
{
System.out.println(num+" is a strong number");
}
else{
System.out.println(num+" is not a strong number");
}
}
}