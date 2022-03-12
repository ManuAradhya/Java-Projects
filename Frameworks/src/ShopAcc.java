
public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges;

public ShopAcc(int accNo,String accNm,float charges) {
this.accNm=accNm;
this.accNo=accNo;
this.charges=charges;
}
public void bookproduct(float charges) {
	
}
public void items(float charges) {
	
}
@Override
public String toString() {
	return(this.accNm+" "+this.accNo+" "+this.charges);
}

//public static void main(String[] args) {
//}
}


