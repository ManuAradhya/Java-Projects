
public class GSShopFactory {

	public GSPrimeAcc getNewPrimeAcc(int accNo,String accNm,float charges,boolean isPrime) {
		return getNewPrimeAcc(accNo, accNm, charges, isPrime);
	}
    public GSNormalAcc getNewNormalAcc(int accNo,String accNm,float charges,float delivaryCharges) {
    	return getNewNormalAcc(accNo, accNm, delivaryCharges, delivaryCharges);
    }
	
}
