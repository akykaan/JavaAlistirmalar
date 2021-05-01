public class User {
	
	int _id;
	String _name;
	String _lastName;
	String _email;
	String _lessons;
	
	public User() {
		System.out.println("User Kurucusu çalýþtý");
	}
		
	public User(int id,String name,String lastName,String email,String lessons) {
		this._id=id;
		this._name=name;
		this._lastName=lastName;
		this._email=email;
		this._lessons=lessons;
	}

	public int get_id() {
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_lastName() {
		return _lastName;
	}

	public void set_lastName(String _lastName) {
		this._lastName = _lastName;
	}

	public String get_email() {
		return _email;
	}

	public void set_email(String _email) {
		this._email = _email;
	}

	public String get_lessons() {
		return _lessons;
	}

	public void set_lessons(String _lessons) {
		this._lessons = _lessons;
	}
	public String getAllUserInfo() {
		return "Ad:"+this.get_name()+"\n"+
				"Soyad:"+this.get_lastName()+"\n"+
				"Email:"+this.get_email()+"\n"+
				"Dersler:"+this.get_lessons();
	}
	
}
