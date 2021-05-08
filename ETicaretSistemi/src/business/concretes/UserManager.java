package business.concretes;

import business.abstracts.MailService;
import business.abstracts.UserInfoCheckService;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	UserInfoCheckService userInfoCheckService;
	MailService mailService;
	UserDao userDao;
	
	public UserManager() {
		
	}
	
	public UserManager(UserInfoCheckService userInfoCheckService,MailService mailService,UserDao userDao) {
		this.userInfoCheckService=userInfoCheckService;
		this.mailService=mailService;
		this.userDao=userDao;
	}
	
	@Override
	public void add(User user) {
		if(this.userInfoCheckService.userInfoValidatation(user)) {
			if(this.userDao.getByMail(user.getePosta())) {
				this.mailService.mailVerification();
				this.mailService.mailVerified();
				this.userDao.add(user);
				System.out.println(user.getAd()+ " kisisi eklendi.");
			}
			else {
				System.out.println("bu mail zaten kayýtlý");
			}
		}
		else {
			System.out.println("hatalý bilgiler tekrar giriniz.");
		}
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
	}
}
