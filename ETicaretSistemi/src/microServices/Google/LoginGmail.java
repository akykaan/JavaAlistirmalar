package microServices.Google;

import java.util.ArrayList;
import java.util.List;

public class LoginGmail {
	List<Gmail> gmails;
	
	public LoginGmail() {
		gmails=new ArrayList<>();
		gmails.add(new Gmail("kaan","akyüz","aky@hotmail.com","123456"));
	}
	
	public boolean login(String mail,String password) {
		
		 if(find(mail) != null && find(mail).getPassword().equals(password)){
	            return true;
	        }
	        return false;
	}
	
	public Gmail find(String mail) {
		Gmail gmailToReturn = this.gmails.stream()
                .filter((user) -> user.getMail().equals(mail) )
                .findFirst()
                .orElse(null);
        return gmailToReturn;
	}
	
}
