
public class UserManager {
	public void add( ) {
		System.out.println("Yeni bir kullanıcı eklendi.");
		
	}
	
	public void add2(UserManager userManager) {
		userManager.add();
	}
}