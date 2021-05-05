
public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager= new NeroCustomerManager(new CustomerCheckManager());
		// BaseCustomerManager CustomerService bağlı 
		// NeroCustomerManager BaseCustomerManager bağlı
		
		// NeroCustomerManager kurucusu CustomerCheckService istiyor
		// CustomerCheckManager CustomerCheckService bağlı
		
		Customer customer = new Customer();
		customer.id=1;
		customer.firstName="";
		customer.lastName=""; // kendi bilgilerinizi giriniz.
		customer.DateOfBirth=;
		customer.tcNo="";
		
		System.out.println("************************");
		customerManager.Save(customer);
		
		System.out.println("----------Mernis Giris Kismi----------");
		
		BaseCustomerManager CustomerManager1=new StarbacksCustomerManager(new MernisServiceAdaptor());
		
		Customer customer1 = new Customer();
		customer1.tcNo=""; // kendi bilgilerinizi giriniz.
		customer1.firstName="";
		customer1.lastName="";
		customer1.DateOfBirth=;
		
		CustomerManager1.Save(customer1);
	}

}
