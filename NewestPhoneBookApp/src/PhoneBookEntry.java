public class PhoneBookEntry {

	private int Id = -1;

	private String fName;

	private String lName;

	private String email;

	private String zip_code;

	private String number;

	public PhoneBookEntry() {

	}

	public PhoneBookEntry(int a, String b, String c, String d, String e, String f) {

		this.Id = a;

		this.fName = b;

		this.lName = c;

		this.email = d;

		this.zip_code = e;

		this.number = f;

	}

	public PhoneBookEntry(String a, String b) {

		this.fName = a;

		this.number = b;

	}

	public PhoneBookEntry(String a) {

		fName = a;

	}

	public int getId() {

		return Id;

	}

	public void setId(int id) {

		this.Id = id;

	}

	public String getfName() {

		return fName;

	}

	public void setfName(String fName) {

		this.fName = fName;

	}

	public String getlName() {

		return lName;

	}

	public void setlName(String lName) {

		this.lName = lName;

	}

	public String getEmail() {

		return email;

	}

	public void setEmail(String email) {

		this.email = email;

	}

	public String getZip_code() {

		return zip_code;

	}

	public void setZip_code(String zip_code) {

		this.zip_code = zip_code;

	}

	public String getNumber() {

		return number;

	}

	public void setNumber(String number) {

		this.number = number;

	}

	public void printBookEntry() {

		System.out.print("Id: " + Id);

		System.out.print(" Name: " + fName + " " + lName);

		System.out.print("  Email: " + email);

		System.out.print("  Zip code: " + zip_code);

		System.out.print("  Number: " + number);

		System.out.println();

	}

}
