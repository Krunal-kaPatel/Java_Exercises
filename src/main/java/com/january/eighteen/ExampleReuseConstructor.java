package com.january.eighteen;
class FullDetails
{
	int id;
	String name,course;
	float fee;
	FullDetails(int id,String name,String course)
	{
		this.id = id;
		this.name = name;
		this.course = course;
	}//we can say it is constructor over loading. 
	FullDetails(int id,String name,String course,float fee)
	{//also called constructor chaining.
		this(id,name,course);//we can reuse the constructor using this keyword, but the ()this must be the first statement in the constructor.  
		this.fee =fee;
	}
	void display()
	{
		System.out.println("User ID = "+id+" Name = "+name+" Course = "+course+" Fee = "+fee);
	}
}
public class ExampleReuseConstructor {
	public static void main(String args[])
	{
		FullDetails d = new FullDetails(007,"Krunal","MCA");
		FullDetails d1 = new FullDetails(011,"Vishal","MCA",10000);
		d.display();
		d1.display();
	}
}
