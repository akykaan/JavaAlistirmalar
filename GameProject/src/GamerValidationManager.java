
public class GamerValidationManager implements GamerValidationService{

	@Override
	public boolean Validate(Gamer gamer) {
		System.out.println("Bilgiler do�ru.");
		return true;
	}
}