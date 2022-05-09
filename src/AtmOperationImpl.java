import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class AtmOperationImpl implements AtmOperationInterf{
	ATM atm=new ATM();
	Map<Double,String> ministmt=new HashMap<>();
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    Date date = new Date();  
	
	@Override
	public void viewBalance() {
		System.out.println("Available balance is: "+atm.getBalance());
		System.out.println();
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
			if(withdrawAmount<=atm.getBalance()) {
				ministmt.put(withdrawAmount," amount withdrawn");
				System.out.println("Collect your cash: "+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				viewBalance();
			}
			else {
				System.out.println("Insufficient balance!!");
				System.out.println();
			}		
	}

	@Override
	public void depositAmount(double depositAmount) {
		ministmt.put(depositAmount," amount deposited");
		System.out.println(depositAmount+"  Deposited Successfully!!");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
		
	}

	@Override
	public void viewMiniStatement() {
		try {
			Thread.sleep(1800);
			System.out.println("************#####************");
			System.out.println(formatter.format(date)); 
			System.out.println();
			for(Map.Entry<Double,String> m:ministmt.entrySet()) {
				System.out.println(m.getKey()+m.getValue());
			}
			System.out.print("New ");
			viewBalance();
			System.out.println("************#####************");
			System.out.println();
		}
		catch(InterruptedException ex)
		{
		    Thread.currentThread().interrupt();
		}
	}
}
