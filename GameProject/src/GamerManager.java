
public class GamerManager implements GamerService{

	GamerValidationService gamerValidationService;
	
	public GamerManager(GamerValidationService gamerValidationService) {
		super();
		this.gamerValidationService = gamerValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerValidationService.Validate(gamer)) {
			System.out.println("Oyun eklendi.");	
		}
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyun güncellendi.");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyun silindi.");
	}

}
