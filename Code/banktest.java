import java.util.*;
class bank
{
	String name;
	double balance;
	bank()
	{
		balance=1000.0;
	}
	void deposit(double bal)
	{
		balance=bal+balance;
	}
	void withdraw(double amt)
	{
		if((balance-amt)>1000)
			balance=balance-amt;
		else
			System.out.println("INSUFFICIENT BALANCE!!");
	}
	void showbal()
	{
		System.out.println("The BALANCE is: "+balance);
	}
}
class banktest
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int opt;
		char ch;
		double d,w;
		bank b = new bank();
		do
		{
			System.out.println("==================================");
			System.out.println("\tBANK DETAILS");
			System.out.println("==================================");
			System.out.println("1. Deposit Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Show balance");
			System.out.println("==================================");
			System.out.println("What would you like to do?: ");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1:System.out.println("Enter the money to be deposited: ");
					   d=sc.nextDouble();
				       b.deposit(d);
					   break;
				case 2:System.out.println("Enter the money to withdraw");
					   w=sc.nextDouble();
					   b.withdraw(w);
					   break;
				case 3:b.showbal();
		    		   break;
			}
			System.out.println("Do you want to continue?(Y/N): ");
			ch=(char)System.in.read();
		}while(ch=='Y'||ch=='y');
	}
}