package com.january.eighteen;
class Values
{
	int id;
	Values()
	{
		System.out.print("ID of krunal is ");
	}
	Values(int id)
	{
		this();// we can call the default constructor using this keyword in parameterize constructor. 
		this.id = id;
		System.out.println(id);
	}
}
public class ExampleThisConstructor {
	public static void main(String args[])
	{
		Values v = new Values(007);
	}
}
