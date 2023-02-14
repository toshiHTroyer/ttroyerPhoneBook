import java.util.Scanner;


public class PhoneBookDirectory {

	static int count = 0;
//to keep track of phone book entries 
	public static PhoneBookEntry[] list;

	
	public PhoneBookDirectory() {
		list  = new PhoneBookEntry[6];

	}


	public int addEntry(PhoneBookEntry entry) {

		if (count >= 6) {

			return 0;

		} else {

			list[count] = entry;

			count++;

			return 1;

		}

	}
	public void print() {

		for (int i = 0; i < 6 && list[i] != null; i++) {

			list[i].printBookEntry();

		}

	}



	public int LinearSearchByPhoneNumber(String PhoneNumber) {
		//iterates from the last entry entered/last highest id after sorted down
		for (int i = count-1; i >= 0; i--) {
			if (list[i].getNumber() == null) {
				continue;
			}else {
				if (list[i].getNumber().equals(PhoneNumber)) {

				list[i].printBookEntry();

				return 1;

			}

		}

	}
		return 0;
	}



	public PhoneBookEntry SearchbyIdBinary(int id) {

	//from Class TextBook(Single Dimensional Array Chapter pages 267 - 268)

		SortPhoneBookEntries();

		int low = 0;

		int high = count;

		while (high >= low) {

			int mid = (low + high)/2;

			if (id < list[mid].getId())

				high = mid - 1;

			else if (id == list[mid].getId()) {

				list[mid].printBookEntry();

				return list[mid];

			}else {

				low = mid + 1;

			}

		}

			

		return new PhoneBookEntry();

	}



	public void SortPhoneBookEntries() {

		

		if (count == 0)

			return;



		for (int i = 0; i < count && list[i] != null; i++) {

			for (int j = i + 1; list[j] != null && j < count; j++) {

				PhoneBookEntry x = null;

				if (list[i].getId() > list[j].getId()) {

					x = list[i];

					list[i] = list[j];

					list[j] = x;



				}

			}

		}

		/*for (int i = 0; i<count  && list[i] != null; i++) {

			if (list[i] != null) {

				list[i].printBookEntry();*/ //this code could be used to print out sorted objects by ID

			}

	



	public int Edit(String firstName, String lastName) {

		if (count == 0) 

			return 0;

		

		for (int i = 0; i < count; i++) {

			if (list[i] != null && firstName.equals(list[i].getfName()) && lastName.equals(list[i].getlName())) {

				Scanner input = new Scanner(System.in);

				

				System.out.println("Enter new First Name: ");

				String first = input.next();



				System.out.println("Enter new Last Name: ");

				String last = input.next();

				

				System.out.println("Enter new Email: ");

				String email = input.next();

				

				System.out.println("Enter new Zip: ");

				String zip = input.next();

				

				System.out.println("Enter new Phone Number: ");

				String phone = input.next();

				

				list[i].setfName(first);

				list[i].setlName(last);

				list[i].setEmail(email);

				list[i].setZip_code(zip);

				list[i].setNumber(phone);

				return 1;

			}



		}

		

		return 0;

	}

//method overloaded

	public int DeleteEntry(int id) {

		if (count > 0) {

			for (int i = 0; i < count && list[i] != null; i++) {

				if (list[i].getId() == id) {

					list[i] = new PhoneBookEntry();

					return 1;

					



				}

			}

		} else {

			return 0;

		}

		return 0;

	}



	public int DeleteEntry(String f, String l) {

		for (int i = 0; i < count && list[i] != null; i++) {

			if (f.equals(list[i].getfName()) && l.equals(list[i].getlName())) {

				// creates new empty PhoneBook Object set empty

				//overloaded method for administrator menu

				list[i] = new PhoneBookEntry();

				return 1;

			}

		}

		return 0;



	}



}
