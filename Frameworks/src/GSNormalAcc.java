
public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float delivaryCharges) {
		super(accNo, accNm, charges, delivaryCharges);
	}
	@Override
	public void bookproduct(float delivaryCharges) {
		
	}
	@Override
	public String toString() {
		return(this.getDelivaryCharges()+" ");
	}
}
