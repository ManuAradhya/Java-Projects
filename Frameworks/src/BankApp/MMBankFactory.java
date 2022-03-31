package BankApp;

public class MMBankFactory extends BankFactory {
	public MMSavingAcc getNewSavingAcc(int accNo,String accNm,float accbal,boolean isSalaried) {
		return getNewSavingAcc(accNo, accNm, accbal, isSalaried);
	}
    public MMCurrentAcc getNewCurrentAcc(int accNo,String accNm,float accbal,float Creditlimit) {
    	return getNewCurrentAcc(accNo, accNm, accbal, Creditlimit);
    }
}
