
public class GSPrimeAcc extends PrimeAcc {
	private float charges;
	
public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}
@Override
public void bookproduct(float delivaryCharges) {
	
}
@Override
public String toString() {
	return(this.isPrime()+" ");
}
}