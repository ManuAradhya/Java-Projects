package BankApp;

public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*BankFactory bf=new MMBankFactory();
bf.getNewSavingAcc(2, "SBI", 654200, true);
System.out.println("Detailes of bankFactory "+ bf);*/

SavingAcc sa=new MMSavingAcc(2, null, 1230, false);
sa.WithDraw(25648);
System.out.println("saving account balance is "+sa);

CurrentAcc ca=new MMCurrentAcc(659872301, "canara", 420, 65000);
ca.Deposite(26648);
System.out.println("current account is "+ ca);
	}

}
