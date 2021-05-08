package business.abstracts;
import entities.concretes.User;

public interface UserInfoCheckService {
	boolean userInfoValidatation(User user);
	boolean passwordVerification(User user);
	boolean emailVerification(User user);
	boolean nameVerification(User user);
	//boolean findMail(User user);
}
