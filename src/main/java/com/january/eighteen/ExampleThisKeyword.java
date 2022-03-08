package com.january.eighteen;
class Details
{
	String name;
	int id;
	int pay;
	Details(String name, int id,int pay)
	{// if we remove this keyword then the instance variable and the parameter of contractor will same and it's create ambiguity.
		//name = name;
		this.name = name;//this.name represent instance variable.
		//id =id;
		this.id = id;
		//pay = pay;
		this.pay = pay;
	}
	void display()
	{
		System.out.println("Name = "+name+" ID = "+id+" Pay = "+pay);
	}
}
public class ExampleThisKeyword {
	public static void main (String args[])
	{
		Details d = new Details("Krunal",007,1500);
		d.display();
	}
}
