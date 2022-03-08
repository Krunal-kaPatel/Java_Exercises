package com.january.twentytwo;

public class ExampleForLoop {
	public static void main(String args[])
	{
		//simple for loop
		for(int i=0;i<=10;i++)
		{
			System.out.print(" "+i);
		}
		//nested for loop
		for(int i=0; i<=3; i++)
		{
			for(int j=3; j>=0; j--)
			{
				System.out.println(i+""+j);
			}
		}
		for(int k=0; k<=5; k++)
		{
			for(int p=0; p<=k; p++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		//for each loop
		int number[]= {5,8,9,5,7,6,12,45,758};
		for (int i : number) {
			System.out.println(i);
		}
	}
}
