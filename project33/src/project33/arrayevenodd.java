package project33;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayevenodd {

	public static void main(String args[])
	{
	int i = 0;
	ArrayList<Integer> even=new ArrayList<Integer>();
	ArrayList<Integer> odd=new ArrayList<Integer>();
	int[] number=new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number :");
	for(i=0; i<number.length; i++)
	{
	number[i]=sc.nextInt();
	if(number[i]%2==0)
	{
	even.add(number[i]);
	}
	else
	{
	odd.add(number[i]);
	}
	}
	System.out.println("Even number is : ");
	for(Integer e:even)
	{
	System.out.println(e+" ");
	}
	System.out.println("Odd number is : ");
	for(Integer o:odd)
	{
	System.out.println(o+" ");
	}

	}



	}

