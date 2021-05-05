
public class CampaignManager implements CampaignService{

	public CampaignManager() {
		
	}
	
	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.campaignName+ " isimli kampanya eklenmiþtir.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.campaignName+ " isimli kampanya silinmiþtir.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.campaignName+ " isimli kampanya güncellenmiþtir.");
	}
}