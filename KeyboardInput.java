import java.util.*;
class KeyboardInput
{
int i,j;
Scanner input=new Scanner(System.in);
void readValues()
{
System.out.println("enter the i value");
i=input.nextInt();
System.out.println("enter the j value");
j=input.nextInt();
}
void addValues()
{
System.out.println("addition is:" +(i+j));}
void subValues(){
System.out.println("subtraction is :" +(i-j));}
void mulValues(){
System.out.println("product is:" +(i*j));}
void moduloValues(){
System.out.println("modulo is:" +(i%j));}
void divValues(){
System.out.println("divison  is:" +(i/j));}
public static void main(String...a)
{
KeyboardInput key=new KeyboardInput();
key.readValues();
key.addValues();
key.subValues();
key.mulValues();
key.moduloValues();
key.divValues();
}
}
