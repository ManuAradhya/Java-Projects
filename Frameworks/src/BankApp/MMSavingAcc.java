package BankApp;

public class MMSavingAcc extends SavingAcc {
	private float Minbal;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}
@Override
public void WithDraw(float Minbal) {
	this.Minbal=Minbal;
}
@Override
public String toString() {
	return(this.isSalaried()+" ");
}
}
