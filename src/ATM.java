
public class ATM {
	private double balance;
	private double dipositAmount;
	private double withdrawAmount;
	//default constructor
	public ATM(){
		
	}
	//getter setter
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getDipositAmount() {
		return dipositAmount;
	}
	public void setDipositAmount(double dipositAmount) {
		this.dipositAmount=dipositAmount;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount=withdrawAmount;
	}
}
