package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserInMemoryDao implements UserDao {

	private List<User> users;
	
	public UserInMemoryDao() {
		users=new ArrayList<>();
	}
		
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kullanýcý veritabanýna eklendi");
	}

	@Override
	public boolean getByMail(String mail) {	
		for (User user : this.users) {
			if (user.getePosta().equals(mail)) {
				System.out.println("Sistemde ayný mail mevcut");
				return false;
			}
		}
		return true;
	}

	
}
