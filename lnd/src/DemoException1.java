import java.io.*;
public class DemoException1 {
public static void main(String[] args) throws IOException  {
	Account sbi=new Account();
	sbi.deposit(4000);
	try {
		sbi.withdraw(70000);
	} catch (InsufficientBalanceException e) {
		System.out.println(e.getMessage());
	}
	}
}
class Account{
	int bal=20000;
	void deposit(int amt) {
		bal+=amt;
		System.out.println("after deposit your balance: \n"+bal);
	}
	void withdraw(int amt) throws InsufficientBalanceException  {
		if(bal>=amt) {
			bal-=amt;
			System.out.println("balance after withdraw :"+bal);
		}
		else {
			InsufficientBalanceException obj=new InsufficientBalanceException("Insufficient balance");
			throw obj;
			
		}
		
	}
}
class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String msg){
		super(msg);
	}
}

