
import java.util.*;
class PrefectNumber
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

int number,sum=0,temp,i=1;
System.out.println("Enter a value:");
number=sc.nextInt();

temp=number;

for(i = 1 ; i < number ; i++) {
			
if(number % i == 0)  {
				
sum = sum + i;
			}
		}
if(temp==sum)
{
System.out.println(temp+" is a prefect number");
}
else{
System.out.println(temp+" is not a prefect number");
}
}
}