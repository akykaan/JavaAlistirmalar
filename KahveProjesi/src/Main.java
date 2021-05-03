
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseCustomerManager customerManager= new NeroCustomerManager(new CustomerCheckManager());
		
		Customer customer = new Customer();
		customer.id=1;
		customer.firstName="kaan";
		customer.lastName="akyüz";
		customer.DateOfBirth=1994;
		customer.tcNo=12345678;
		
		
		customerManager.Save(customer);
		
		BaseCustomerManager baseCustomerManager=new StarbacksCustomerManager(new CustomerCheckManager());
		
		baseCustomerManager.Save(customer);
		
	}

}
