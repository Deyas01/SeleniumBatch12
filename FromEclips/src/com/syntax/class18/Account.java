package com.syntax.class18;

public class Account {
	
	
	private String userName="Teyfur";
	private String password="Admin";
	public String accountNumber="123456";
	private double balance=-1500;
	
	private void printUserName() { System.out.println(userName);
		System.out.println(userName);
	}
		private void printPassword() { System.out.println(password);
			System.out.println(password);
		}
			private void printbalance() { System.out.println(balance);
				System.out.println(balance);
			}	
				private void printaccountNumber() { System.out.println(accountNumber);
					
	}
	

	public static void main(String[] args) {
		
		Account account=new Account();
		System.out.println(account.userName);
		System.out.println(account.password);
		System.out.println(account.balance);
		System.out.println(account.accountNumber);
		
		account.printUserName();
		account.printPassword();
		account.printbalance();
		account.printaccountNumber();
	}

}
