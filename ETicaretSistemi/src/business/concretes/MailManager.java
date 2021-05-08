package business.concretes;

import business.abstracts.MailService;

public class MailManager implements MailService {
	
	public MailManager() {
		
	}

	@Override 
	public void mailVerification() {
		System.out.println("Mail g�nderildi.Linke T�klay�n�z.");
	}

	@Override
	public void mailVerified() {
		System.out.println("�yelik tamamland�.");
		
	}

}
