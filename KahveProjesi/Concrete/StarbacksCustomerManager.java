
public class StarbacksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbacksCustomerManager() {
		System.out.println("Giris yapýldý");
	}
	
	public StarbacksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer) throws Exception{
		
		if (customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}
		else {
			throw new Exception("Not a valid person");
		}
	}
}