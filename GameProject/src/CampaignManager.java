
public class CampaignManager implements CampaignService{

	public CampaignManager() {
		
	}
	
	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.campaignName+ " isimli kampanya eklenmi�tir.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.campaignName+ " isimli kampanya silinmi�tir.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.campaignName+ " isimli kampanya g�ncellenmi�tir.");
	}
}