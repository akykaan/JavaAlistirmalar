
public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager=new GamerManager(new GamerValidationManager());
		
		Gamer gamer=new Gamer(1,"Kaan","Aky�z",12345,"1994");
		
		/*
		gamer.id=1;
		gamer.firstName="Kaan";
		gamer.lastName="Aky�z";
		gamer.dogumY�l�="1994";
		gamer.tcNo=12345;
		*/
		
		gamerManager.add(gamer);
		
		CampaignManager campaignManager=new CampaignManager();
		Campaign campaign=new Campaign(1,"X kampanyas�",50);
		
		/*
		campaign.id=1;
		campaign.campaignName="X kampanyas�";
		campaign.discount=50;
		*/
		
		campaignManager.add(campaign);
		
		GameSaleManager gameSaleManager=new GameSaleManager();
		GameSale gameSale=new GameSale();
		gameSale.id=1;
		gameSale.name="BattleFront";
		gameSale.price=300;
		
		gameSale.campaign=campaign; // gameSale'in i�indeki campaign de�i�keninin referans�n� Campaign'e e�itle
		
		System.out.println("--------------");
		
		gameSaleManager.whoWasBuy2(gameSale,gamer);
		
		
		

	}
}