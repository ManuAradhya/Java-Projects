
public class ShopFactory {

	public PrimeAcc getNewPrimeAccount(int accNo,String accNm,float charges,boolean isPrime) {
		return getNewPrimeAccount(accNo, accNm, charges, isPrime);
		
	}
	public NormalAcc getNewNormalAccount(int accNo,String accNm,float charges,float delivaryCharges) {
		return getNewNormalAccount(accNo, accNm, delivaryCharges, delivaryCharges);
		
	}
}
