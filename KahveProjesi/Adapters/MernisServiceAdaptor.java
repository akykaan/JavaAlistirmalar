import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		
		
		KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();
		
		boolean request=false;
		try {
			request = kpsPublicSoap.TCKimlikNoDogrula
					(Long.parseLong(customer.tcNo),customer.firstName.toUpperCase(),customer.lastName.toUpperCase(),customer.DateOfBirth);
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch (RemoteException e) {
			e.printStackTrace();
		}
		if (request) {
			return true;
		}
		return false;
		
	}

}
