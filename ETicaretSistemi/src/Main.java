

import business.abstracts.UserService;
import business.concretes.AuthManager;
import business.concretes.MailManager;
import business.concretes.UserInfoCheckManager;
import business.concretes.UserManager;
import core.LoginGmailAdapter;
import core.LoginGmailService;
import dataAccess.concretes.UserInMemoryDao;
import entities.concretes.User;
import microServices.Google.Gmail;

public class Main {

	public static void main(String[] args) {
				
		User user=new User(1,"kaan","akyüz","abc123@hotmail.com","123456");
		User user1=new User(1,"kaan","akyüz","abc1234@hotmail.com","123456");
		//UserManager userManager=new UserManager(new UserInfoCheckManager());
		//userManager.add(user);
		
		UserService userService=new UserManager(new UserInfoCheckManager(),new MailManager(),new UserInMemoryDao());
		
		userService.add(user);		
		
		System.out.println("-------------");
		userService.add(user1);
		
		
		System.out.println("\nGoogle hesabý ile giris simulasyon kýsmý\n");
		
		// "kaan","akyüz","aky@hotmail.com","123456" sahte gmail bilgileri
		// farklý mail girerek hata mesajýný elde edebilirsiniz.
		User gmailUser=new User(1,"kaan","akyüz","aky@hotmail.com","123456"); 
				
		// gmail yerine face üzerinden rahatca kullanabiliriz
		AuthManager authManager=new AuthManager(new LoginGmailAdapter());
		authManager.loginGoogleMail(gmailUser);
		
		
	}

}
