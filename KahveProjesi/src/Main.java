
public class Main {

	public static void main(String[] args) throws Exception {
		
		BaseCustomerManager customerManager= new NeroCustomerManager(new CustomerCheckManager());
<<<<<<< HEAD
		// BaseCustomerManager CustomerService ba�l� 
		// NeroCustomerManager BaseCustomerManager ba�l�
		
		// NeroCustomerManager kurucusu CustomerCheckService istiyor
		// CustomerCheckManager CustomerCheckService ba�l�
=======
		// BaseCustomerManager CustomerService bağlı 
		// NeroCustomerManager BaseCustomerManager bağlı
		
		// NeroCustomerManager kurucusu CustomerCheckService istiyor
		// CustomerCheckManager CustomerCheckService bağlı
>>>>>>> branch 'master' of https://github.com/akykaan/JavaAlistirmalar.git
		
		Customer customer = new Customer();
		customer.id=1;
		customer.firstName="furkan kaan";
		customer.lastName="aky�z"; // kendi bilgilerinizi giriniz.
		customer.DateOfBirth=1994;
		customer.tcNo="1234";
		
		System.out.println("************************");
		customerManager.Save(customer);
		
		System.out.println("----------Mernis Giris Kismi----------");
		
		BaseCustomerManager CustomerManager1=new StarbacksCustomerManager(new MernisServiceAdaptor());
		
		Customer customer1 = new Customer();
		customer1.tcNo="59845045448"; // kendi bilgilerinizi giriniz.
		customer1.firstName="furkan kaan";
		customer1.lastName="aky�z";
		customer1.DateOfBirth=1994;
		
		CustomerManager1.Save(customer1);
	}

}
