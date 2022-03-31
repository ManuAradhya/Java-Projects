package BankApp;

public abstract class BankFactory {
	public SavingAcc getNewSavingAcc(int accNo,String accNm,float accBal,boolean isSalaried) {
		return getNewSavingAcc(accNo, accNm, accBal, isSalaried);
		
	}
	public CurrentAcc getNewCurrentAcc(int accNo,String accNm,float accBal,float CreditLimit) {
		return getNewCurrentAcc(accNo, accNm, accBal, CreditLimit);
		
	}
}
