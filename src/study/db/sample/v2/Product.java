package study.db.sample.v2;

public class Product {
	int pCode;
	String pNmae;
	int pPrice;
	
	
	public Product() {}
	public Product(int pCode, String pNmae, int pPrice) {
		this.pCode = pCode;
		this.pNmae = pNmae;
		this.pPrice = pPrice;
	}
	
	public int getpCode() {
		return pCode;
	}
	public void setpCode(int pCode) {
		this.pCode = pCode;
	}
	public String getpNmae() {
		return pNmae;
	}
	public void setpNmae(String pNmae) {
		this.pNmae = pNmae;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
