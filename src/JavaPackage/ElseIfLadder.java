package JavaPackage;

import java.util.Scanner;

public class ElseIfLadder {
public static void main(String[] args) 
{
	int a=10;
	int b=5;
	System.out.println("enter the operator");
	Scanner scan = new Scanner(System.in);
	char ch = scan.next().charAt(0); //to input character
	
	if(ch=='+')
	{
		System.out.println(a+b);
	}
	else if(ch=='-')
	{
		System.out.println(a-b);
	}
	else if(ch=='*')
	{
		System.out.println(a*b);	
	}
	else if(ch=='/')
	{
		System.out.println(a/b);
	}
	else
	{
		System.out.println("Invalid Operator");
	}


}}
