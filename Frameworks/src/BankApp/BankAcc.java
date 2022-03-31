package BankApp;

 public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;

public BankAcc(int accNo,String accNm,float accBal) {
this.accNm=accNm;
this.accNo=accNo;
this.accBal=accBal;
}
public void WithDraw(float accBal) {
	this.accBal=accBal;
}
public void Deposite(float accBal) {
	this.accBal=accBal;
}
@Override
public String toString() {
	return(this.accNm+" "+this.accNo+" "+this.accBal);
}

}
