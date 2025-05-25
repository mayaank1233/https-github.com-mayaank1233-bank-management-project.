import java.util.*;
class Account
{
	private int acno;
	private String name;
	private int balance;
	Scanner sc=new Scanner(System.in);
	public void readData()
	{
		System.out.println("enter account details");
		acno=sc.nextInt();
		name=sc.next();
		balance=sc.nextInt();
	}
	public void showData()
	{
		System.out.println(acno+" "+name+" "+balance);
	}
	public void deposit()
	{
		System.out.println("enter amt to be deposit");
		int amt=sc.nextInt();
		balance=balance+amt;
		System.out.println(amt+" successfully deposited");
	}
	public void withdraw()
	{
		System.out.println("enter amt to be withdraw");
		int amt=sc.nextInt();
		if(balance-amt>=1000)
		{
			balance=balance-amt;
			System.out.println(amt+" successfully withdrawled");
		}
		else
		{
			System.out.println("not enough balance");
		}
	}
	public int getacno()
	{
		return acno;	
	}
}
class BankDemo
{
	public static void main(String[] args) {
		Account[] a=new Account[3];
		Scanner sc=new Scanner(System.in);
		int i,n,choice,f;
		do{
			System.out.println("1:Add Account\n2:Show Details\n3:Withdrawl\n4:Deposit\n5:Exit\nenter ur choice");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					for(i=0;i<a.length;i++)
					{
						a[i]=new Account();
						a[i].readData();
					}break;
				case 2:
						for(i=0;i<a.length;i++)
						{
							a[i].showData();
						}
						break;
				case 3:	f=0;
						System.out.println("enter acno to withdraw");
						n=sc.nextInt();
						for(i=0;i<a.length;i++)
						{
							if(n==a[i].getacno())
							{
								f=1;
								a[i].withdraw();
								break;
							}
						}
						if(f==0)
							System.out.println("acno not found!");
						break;
				case 4:f=0;
						System.out.println("enter acno to deposit");
						n=sc.nextInt();
						for(i=0;i<a.length;i++)
						{
							if(n==a[i].getacno())
							{
								f=1;
								a[i].deposit();
								break;
							}
						}
						if(f==0)
							System.out.println("acno not found!");
						break;
			}
		}while(choice!=5);
	}
}