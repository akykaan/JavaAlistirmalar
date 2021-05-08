package business.concretes;
import java.util.regex.Pattern;
import business.abstracts.UserInfoCheckService;
import entities.concretes.User;

public class UserInfoCheckManager implements UserInfoCheckService{

	@Override
	public boolean userInfoValidatation(User user) {
		
		if( passwordVerification(user) && emailVerification(user) && nameVerification(user)  ) {
			return true;
		}
		return false;
		
	}
	
	@Override
	public boolean passwordVerification(User user) {
		if(user.getParola().length()<6) {
			System.out.println("Sifre 6 karakterden b�y�k olmal�.");
			return false;
		}
		System.out.println("Sifre 6 karakterden b�y�kt�r.");
		return true;
	}

	@Override
	public boolean emailVerification(User user) {
		String regex="^[A-Za-z0-9+_.-]+@(.+)$";	
		
		if (  Pattern.matches(regex, user.getePosta())  ) {
			System.out.println("Mail Do�rulama Basar�l�");
			return true;
		}
		else {
			System.out.println("Mail Do�rulama Basar�s�z.");
			return false;
		}
	}
	
	@Override
	public boolean nameVerification(User user) {
		if (user.getAd().length()<2 && user.getSoyad().length()<2) {
			System.out.println("isim ve soyad 2 karakterden k�c�k olamaz.");
			return false;
		}
		System.out.println("isim ve soyad dogrudur");
		return true;
	}
	
}
