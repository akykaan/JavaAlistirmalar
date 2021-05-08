package business.concretes;

import business.abstracts.AuthService;
import core.LoginGmailAdapter;
import entities.concretes.User;

public class AuthManager implements AuthService{

	private LoginGmailAdapter loginGmailAdapter;
	
	
	public AuthManager(LoginGmailAdapter loginGmailAdapter) {
		this.loginGmailAdapter = loginGmailAdapter;
	}

	@Override
	public void loginGoogleMail(User user) {		
		this.loginGmailAdapter.login(user.getePosta(),user.getParola());
	}
}