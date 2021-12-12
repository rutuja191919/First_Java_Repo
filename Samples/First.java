import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Palindrome
{
public static void main(String args[])
{
int num,sum=0,rem,temp;
num=temp;
Scanner sc=new Scanner(System.in);
System.out.print("Please enter number to check palindrome or not?");
num=sc.nextInt();
while(num>0)
{
	rem=num%10;
	sum=sum+(rem*10);
	rem=rem/10;
}
if(sum==temp)
	System.out.print("No is palindrome");\
	else
		System.out.print("No is not palindrome");
}
}