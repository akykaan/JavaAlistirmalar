package core;

import microServices.Google.LoginGmail;

public class LoginGmailAdapter implements LoginGmailService{

	@Override
	public boolean login(String mail, String password) {
		LoginGmail loginGmail=new LoginGmail();
		
		boolean result=loginGmail.login(mail,password);
		
		if (result) {
			System.out.println("Google giris bilgileri dogrudur");
			return true;
		}System.out.println("Google giris bilgileri yanlýstýr");
		return false;
	}

}
