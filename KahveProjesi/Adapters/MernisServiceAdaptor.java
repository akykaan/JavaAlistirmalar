
public class MernisServiceAdaptor implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		
		return true;
		// KPSPublicSoapClient client =new KPSPublicSoapClient();
		// return client.TCKimlikNoDogrula(customer.tcNo,customer.firstName,customer.lastName,customer.DateOfBirth);
		
	}

}
