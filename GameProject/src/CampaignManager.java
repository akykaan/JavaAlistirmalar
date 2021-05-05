
public class CampaignManager implements CampaignService{

	public CampaignManager() {
		
	}
	
	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.campaignName+ " isimli kampanya eklenmiştir.");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.campaignName+ " isimli kampanya silinmiştir.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.campaignName+ " isimli kampanya güncellenmiştir.");
	}
}