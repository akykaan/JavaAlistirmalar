
public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		System.out.println("Doğru bir kişi.");
		return true;
		
	}
	
}
