
public class GameSaleManager implements GameSaleService{

	
	public GameSaleManager() {
		
	}
	
	@Override
	public void whoWasBuy(GameSale gameSale, Gamer gamer) {
		
		System.out.println(gameSale.name+" oyununu "+gamer.getFirstName()+" oyuncusu alm��t�r.");
	}
	
	public void whoWasBuy2(GameSale gameSale,Gamer gamer) {
		
		
		int discount = gameSale.campaign.discount;
		gameSale.price=gameSale.price-((gameSale.price*discount)/100);
	
		System.out.println(gameSale.name+" oyununu "+gamer.getFirstName()+" oyuncusu "+gameSale.price+" fiyatina almistir.");
	}
}