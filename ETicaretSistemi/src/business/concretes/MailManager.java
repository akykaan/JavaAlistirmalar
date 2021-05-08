package business.concretes;

import business.abstracts.MailService;

public class MailManager implements MailService {
	
	public MailManager() {
		
	}

	@Override 
	public void mailVerification() {
		System.out.println("Mail gönderildi.Linke Týklayýnýz.");
	}

	@Override
	public void mailVerified() {
		System.out.println("Üyelik tamamlandý.");
		
	}

}
