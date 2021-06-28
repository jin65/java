
public class BicycleShop {
	private String shopID;
	private int saleForToday;
	private static int totalsale;
	public BicycleShop(String i, int n){
		shopID=i;
		saleForToday=n;
	}
	public void sold() {
		saleForToday++;
		totalsale++;
	}
	public void trackSaleStatus() {
		System.out.println(shopID+" 판매대수 "+saleForToday);
	}
	public static int overallSale(){
		return totalsale;
	}
}
