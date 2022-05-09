import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainClass {
	public static void main(String[] args) {
		int atmNumber= 12345;
		int atmPin=123;
		AtmOperationInterf op=new AtmOperationImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to ATM Machine ");
		System.out.println();
		try
		{
		    Thread.sleep(1800);
			System.out.println("Please enter ATM number: ");
			int givenAtmNumber=sc.nextInt();
			System.out.println("Please enter pin for this ATM: ");
			int givenAtmPin=sc.nextInt();
			if((atmNumber==givenAtmNumber)&&(atmPin==givenAtmPin)){
				System.out.println("Validation Done!!");
				Thread.sleep(1800);
				System.out.println();
				while(true) {
					Thread.sleep(00);
					System.out.println("1.View available balance\n2.Withdraw amount\n3.Deposit amount\n4.View mini statement\n5.Exit");
					System.out.println("Enter Choice: ");
					int ch= sc.nextInt();
					if(ch==1) {
						op.viewBalance();
					}else if(ch==2) {
						System.out.println("Enter amount to withdraw: ");
						double withdrawAmount=sc.nextDouble();
						op.withdrawAmount(withdrawAmount);
					}else if(ch==3) {
						System.out.println("Enter amount to deposit: ");
						double depositAmount=sc.nextDouble();
						op.depositAmount(depositAmount);
					}else if(ch==4) {
						op.viewMiniStatement();
					}else if(ch==5) {
						System.out.println("Please collect your cash!\nThank you for using this ATM!");
						System.exit(0);
					}else{
						System.out.println("Please enter a valid choice!");
					}
				}
			}
					else {
						System.out.println("Wrong Atm number or Pin!!");
						System.exit(0);
					}
				
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
		
	}

}
