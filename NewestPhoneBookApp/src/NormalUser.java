public class NormalUser extends User implements forNormalUser{

	private static int id;

	

	public NormalUser() {

		this.directory = new PhoneBookDirectory();

		

	}

	public NormalUser(String userName, String password, int c) {

		super(userName, password);

		NormalUser.id = c;

	}



	public int getId() {

		return NormalUser.id;

	}



	public void setId(int id) {

		NormalUser.id = id;

	}
//overrides method in User parent class
	public void PrintUserInfo() {

		System.out.print("Username: " + getUserName());

		System.out.print(" Password: " + getPassword());

		System.out.print(" Id: " + getId());

		System.out.println();

	}

	public void addNewEntry(PhoneBookEntry directory) {

			this.directory.addEntry(directory);

		

	}

	public void editEntry(String firstName, String lastName) {

		this.directory.Edit(firstName, lastName);

	}

	public void LinearSearch(String pn) {

		this.directory.LinearSearchByPhoneNumber(pn);

	}

	

	public void Sort() {

		this.directory.SortPhoneBookEntries();
		this.directory.print();

	}

	

	



}

