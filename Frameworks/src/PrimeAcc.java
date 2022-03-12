
public abstract class PrimeAcc extends ShopAcc{
	private boolean isPrime;
	 static private float delivaryCharges;

public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
	}
@Override
public void bookproduct(float delivaryCharges) {
	
}
@Override
public String toString() {
	return(this.isPrime()+" ");
}
public boolean isPrime() {
	return isPrime;
}
public void setPrime(boolean isPrime) {
	this.isPrime = isPrime;
}
}