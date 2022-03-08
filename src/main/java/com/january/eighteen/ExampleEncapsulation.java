package com.january.eighteen;
class Account
{	//using private keyword we can do data hiding.
	private int accNo;
	private String name,email;
	private long ammount;
	//using getter seater method we can access the private variable.
	//if any components follows data hiding under abstraction is called encapsulation.
	//encapsulation = data hiding + abstraction.
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getAmmount() {
		return ammount;
	}
	public void setAmmount(long ammount) {
		this.ammount = ammount;
	}
	
}
public class ExampleEncapsulation {
	public static void main(String args[])
	{
		Account a = new Account();
		a.setAccNo(14007);
		a.setName("Krunal");
		a.setEmail("krunalpatel1210@gmail.com");
		a.setAmmount(100000);
		System.out.println("Account Number : "+a.getAccNo()+"\nName : "+a.getName()+"\nEmail : "+a.getEmail()+"\nAmount : "+a.getAmmount());
	}
}
