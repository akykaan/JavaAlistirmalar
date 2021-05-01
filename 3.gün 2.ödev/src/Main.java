
public class Main {

	public static void main(String[] args) {
		
		// öğrenci
		User user=new User(1,"Ahmet","Taşkın", "...hotmail.com","C++");
		// öğretmen
		User user1=new User(2,"Kaan","Akyüz", "...hotmail.com","Java");
		
		System.out.println(user.get_name());
		System.out.println(user1.get_name());
		
		System.out.println(user.getAllUserInfo());
		
		UserManager[] userManagers=new UserManager[]{
			new StudentManager(),
			new InstructorManager()
		};
		
		for(UserManager userManager:userManagers) {
			userManager.add();
		}
		
		System.out.println("---------------------------");
		
		UserManager userManager=new UserManager();
		userManager.add2(new StudentManager());
		userManager.add2(new InstructorManager());
	}

}
