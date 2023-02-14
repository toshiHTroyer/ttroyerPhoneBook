

public class PhoneBookAdmin extends User implements forAdmin{

	private String emailAddress;
//password/userName extended from User
	

	public PhoneBookAdmin(){

		this.directory = new PhoneBookDirectory();

	}

	public PhoneBookAdmin(String userName, String password, String email) {

		super(userName, password);

		this.emailAddress = email;

	}

	public String getEmailAddress() {

		return this.emailAddress;

	}



	public void setEmailAddress(String emailAddress) {

		this.emailAddress = emailAddress;

	}

	public void PrintUserInfo() {

		System.out.print("Username: " + getUserName());

		System.out.print(" Password: " + getPassword());

		System.out.print(" Email Address: " + getEmailAddress());

		System.out.println();

		

	}

	

	public void addNewEntry(PhoneBookEntry directory) {

			this.directory.addEntry(directory);

		

	}

	public void editEntry(String firstName, String lastName) {

			this.directory.Edit(firstName, lastName);

	}

	public void delete(String f, String l) {

			this.directory.DeleteEntry(f, l);

	

	}

	

	public void sortByBinary(int c) {

			this.directory.SearchbyIdBinary(c);

	}

	

	public void changeUsername(String newName) {

			this.userName = newName;

	}

	public void changePassword(String newPassword) {

			this.password = newPassword;

	}

	

	public void LinearSearch(String pn) {

			this.directory.LinearSearchByPhoneNumber(pn);

	}

	

	public void Sort() {

			this.directory.SortPhoneBookEntries();
			this.directory.print();

	}

	

}
