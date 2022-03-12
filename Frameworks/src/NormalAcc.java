
public abstract class NormalAcc extends ShopAcc {
	private float delivaryCharges;
	
	public NormalAcc(int accNo, String accNm, float charges,float delivaryCharges) {
		super(accNo, accNm, charges);
	}
	@Override
	public void bookproduct(float delivaryCharges) {
		
	}
	@Override
	public String toString() {
		return(this.getDelivaryCharges()+" ");
	}
	public float getDelivaryCharges() {
		return delivaryCharges;
	}
	public void setDelivaryCharges(float delivaryCharges) {
		this.delivaryCharges = delivaryCharges;
	}
}
