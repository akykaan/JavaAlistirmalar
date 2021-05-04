import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements CustomerService{

	public BaseCustomerManager() {
		System.out.println("Giris yap�ld�.");
	}
	
	@Override
	public void Save(Customer customer) throws Exception{
		System.out.println("Saved to db : " +customer.firstName );
	}

}
