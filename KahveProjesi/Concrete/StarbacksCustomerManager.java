
public class StarbacksCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbacksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void Save(Customer customer){
		try {
			if (customerCheckService.CheckIfRealPerson(customer)) {
				super.Save(customer);
			}
		}
		catch (Exception e) {
			System.out.println("Not a valid person");
		}
	}
}