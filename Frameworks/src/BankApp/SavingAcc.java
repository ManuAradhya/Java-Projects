package BankApp;

 public abstract class SavingAcc extends BankAcc {
private boolean isSalaried;
private float Minbal;
	
public SavingAcc(int accNo, String accNm, float accBal,boolean isSalaried) {
		super(accNo, accNm, accBal);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void WithDraw(float Minbal) {
		this.Minbal=Minbal;
	}
	@Override
	public String toString() {
		return(this.isSalaried()+" ");
	}
	public boolean isSalaried() {
		return isSalaried();
	}
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
}
