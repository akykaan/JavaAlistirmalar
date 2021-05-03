
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BaseCustomerManager customerManager= new NeroCustomerManager(new CustomerCheckManager());
		
		Customer customer = new Customer();
		customer.id=1;
		customer.firstName="furkan kaan";
		customer.lastName="akyüz";
		customer.DateOfBirth=1994;
		customer.tcNo="1234";
		
		
		customerManager.Save(customer);
		
		
		System.out.println("Mersis Giris Kismi");
		
		BaseCustomerManager CustomerManager1=new StarbacksCustomerManager(new MernisServiceAdaptor());
		
		Customer customer1 = new Customer();
		customer1.tcNo="12345677";
		customer1.firstName="furkan kaan";
		customer1.lastName="akyüz";
		customer1.DateOfBirth=1994;
		
		CustomerManager1.Save(customer1);
		
	}

}
