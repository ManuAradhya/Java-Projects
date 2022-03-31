package BankApp;

 public abstract class CurrentAcc extends BankAcc {
private float CreditLimit;
	public CurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void WithDraw(float CreditLimit) {
		this.CreditLimit=CreditLimit;
	}
	@Override
	public String toString() {
		return(this.getCreditLimit()+" ");
	}
	public float getCreditLimit() {
		return CreditLimit;
	}
	public void setCreditLimit(float CreditLimit) {
		this.CreditLimit = CreditLimit;
	}
}
