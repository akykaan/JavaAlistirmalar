
public class GamerValidationManager implements GamerValidationService{

	@Override
	public boolean Validate(Gamer gamer) {
		System.out.println("Bilgiler doðru.");
		return true;
	}
}