
public class Main {

	public static void main(String[] args) {
		
		// ��renci
		User user=new User(1,"Ahmet","Ta�k�n", "...hotmail.com","C++");
		// ��retmen
		User user1=new User(2,"Kaan","Aky�z", "...hotmail.com","Java");
		
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
