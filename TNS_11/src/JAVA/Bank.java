package JAVA;



public class Bank {
	private static int totalAcc=0;
	
	public Bank() {
		totalAcc++;
	}
	
	public static int gettotalAcc() {
		return totalAcc;
	}
	public static void main(String[]args) {
		Bank Acc1=new Bank();
		Bank Acc2=new Bank();
		
		System.out.println("total number bank account:" + Bank.gettotalAcc());
	}

}
