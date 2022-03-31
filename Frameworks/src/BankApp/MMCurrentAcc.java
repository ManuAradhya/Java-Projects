package BankApp;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float Creditlimit) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void WithDraw(float CreditLimit) {
		
	}
	@Override
	public String toString() {
		return(this.getCreditLimit()+" ");
	}
}
