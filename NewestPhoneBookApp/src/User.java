public class User {

	protected PhoneBookDirectory directory;

	protected String userName;

	protected String password;

	

	public User(){

		this.directory = new PhoneBookDirectory();

	}

	public User(String a, String b) {

		this.userName = a;

		this.password = b;

		this.directory = new PhoneBookDirectory();

		

	}



	public String getUserName() {

		return userName;

	}

	public void setUserName(String userName) {

		this.userName = userName;

	}

	public String getPassword() {

		return password;

	}

	public void setPassword(String password) {

		this.password = password;

	}

	public PhoneBookDirectory getDirectory() {

		return directory;

	}

	public void setDirectory(PhoneBookDirectory directory) {

		this.directory = directory;

	}


//overriden by admin/normal user subclasses
	public void PrintUserInfo() {

		

	}

	



	

}
