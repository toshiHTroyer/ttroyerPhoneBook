import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PhoneBookApplication {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		new PhoneBookDirectory();
		PhoneBookAdmin Admin = new PhoneBookAdmin();
		NormalUser normUser = new NormalUser();
		boolean administrator = false;
		boolean normalUser = false;

		System.out.println("Are you an Administrator(1) or Normal User(2) ?");
		int response = input.nextInt();

		if (response == 1) {
			String line = "";
			String[] adminParameters = new String[3];
			try {
				File file = new File("src/admin");
				Scanner myReader = new Scanner(file);
				while (myReader.hasNextLine()) {
					line = myReader.nextLine();
					adminParameters = line.split(",");
				}
				myReader.close();

			} catch (FileNotFoundException ex) {
				System.out.println("file not found");
			} catch (IOException ex) {

				System.out.println("IO Exception");
				ex.printStackTrace();
			}

			int count = 0;
			while (count < 3) {

				System.out.println("Enter a Username");
				String uName = input.next();

				System.out.println("Enter a Password");
				String passcode = input.next();

				System.out.println("Enter an email");
				String total_email = input.next();

				if (adminParameters[0].equals(uName) && adminParameters[1].equals(passcode)) {
					System.out.println("You're in!");
					administrator = true;
					Admin = new PhoneBookAdmin(uName, passcode, total_email);
					break;
				} else {
					System.out.println("Try Again");
					count++;
				}
			}

		} else if (response == 2) {
			String line = "";
			String[] userParam = new String[3];
			try {
				File fileReader = new File("src/normalUser");
				Scanner myReader = new Scanner(fileReader);
				while (myReader.hasNextLine()) {
					line = myReader.nextLine();
					userParam = line.split(",");
				}
				myReader.close();
			} catch (FileNotFoundException ex) {
				System.out.println("file not found");
			} catch (IOException ex) {

				System.out.println("IO Exception");
				ex.printStackTrace();
			}

			int count = 0;
			while (count < 3) {
				System.out.println("Enter a Username");
				String uName = input.next();
				System.out.println("Enter a Password");
				String passcode = input.next();
				System.out.println("Enter an ID");
				int new_id = input.nextInt();

				if (uName.equals(userParam[0]) && passcode.equals(userParam[1])) {
					System.out.println("You're in!");
					normUser = new NormalUser(uName, passcode, new_id);
					normalUser = true;
					break;
				} else {
					System.out.println("try again");
					count++;

				}
			}

		} else {
			System.out.println("Enter Valid Entry.");
		}
		
		while (administrator) {
			int a = printAdminMenu();
			//menu for administrator
			switch (a) {
			//switch case to loop through until exit with each menu case
			case 1:
				System.out.println("What is the id? ");
				int Id = input.nextInt();
				System.out.println("What is the first name? ");
				String fname = input.next();
				System.out.println("What is the last name? ");
				String lname = input.next();
				System.out.println("What is the email? ");
				String mail = input.next();
				System.out.println("What is the zip code? ");
				String zip = input.next();
				System.out.println("What is the phone number?");
				String number = input.next();

				PhoneBookEntry newObject = new PhoneBookEntry(Id, fname, lname, mail, zip, number);
				Admin.addNewEntry(newObject);
				break;
			case 2:
				System.out.println("What is the first name? ");
				String f = input.next();
				System.out.println("What is the last name? ");
				String l = input.next();
				Admin.editEntry(f, l);
				break;
			case 3:
				System.out.println("What is the first name? ");
				String ef = input.next();
				System.out.println("What is the last name? ");
				String el = input.next();
				Admin.delete(ef, el);
				break;
			case 4:
				Admin.Sort();
				break;
			case 5:
				System.out.println("What is the phone number?");
				String pnum = input.next();
				Admin.LinearSearch(pnum);
				break;
			case 6:
				System.out.println("What is ID?");
				int idnum = input.nextInt();
				Admin.sortByBinary(idnum);
				break;
			case 7:
				Admin.PrintUserInfo();
				break;
			case 8:
				System.out.println("What is the new password?");
				String newp = input.next();
				Admin.changePassword(newp);
				break;
			case 9:
				System.out.println("What is the new username?");
				String newun = input.next();
				Admin.changeUsername(newun);
				break;
			case 10:
				administrator = false;
				System.out.println("thank you!");
				break;

			default:
				System.out.println("Incorrect entry.");
				break;

			}
		}

		while (normalUser) {
			int b = printNormalMenu();
			switch (b) {
			case 1:
				System.out.println("What is the id? ");
				int Id = input.nextInt();
				System.out.println("What is the first name? ");
				String fname = input.next();
				System.out.println("What is the last name? ");
				String lname = input.next();
				System.out.println("What is the email? ");
				String mail = input.next();
				System.out.println("What is the zip code? ");
				String zip = input.next();
				System.out.println("What is the phone number?");
				String number = input.next();

				PhoneBookEntry newObject = new PhoneBookEntry(Id, fname, lname, mail, zip, number);
				normUser.addNewEntry(newObject);
				break;
			case 2:
				System.out.println("What is the first name? ");
				String f = input.next();
				System.out.println("What is the last name? ");
				String l = input.next();
				normUser.editEntry(f, l);
				break;
			case 3:
				normUser.Sort();
				break;
			case 4:
				System.out.println("What is the phone number?");
				String plum = input.next();
				normUser.LinearSearch(plum);
				break;
			case 5:
				normUser.PrintUserInfo();
				break;
			case 6:
				normalUser = false;
				System.out.println("thank you!");
				break;
			default:
				System.out.println("Incorrect entry.");
				break;
			}
		}
	}
//methods to print menus for admin/user
	public static int printAdminMenu() {
		Scanner input = new Scanner(System.in);
		int i;
		System.out.println("(1)Add a phone Entry");
		System.out.println("(2)Edit a phone entry of a given first name and last name");
		System.out.println("(3)Delete a phone entry of a given first name and last name");
		System.out.println("(4)Sort the PhoneBook Directory");
		System.out.println("(5)Search using Linear Search");
		System.out.println("(6)Search using Binary Search");
		System.out.println("(7)Print Admin's info");
		System.out.println("(8)Change Password");
		System.out.println("(9)Change Username");
		System.out.println("(10)exit");
		System.out.println();
		i = input.nextInt();
		return i;
	}

	public static int printNormalMenu() {
		Scanner input = new Scanner(System.in);
		int i;
		System.out.println("(1)Add a phone Entry");
		System.out.println("(2)Edit a phone entry of a given first name and last name");
		System.out.println("(3)Sort the PhoneBook Directory");
		System.out.println("(4)Search using Linear Search");
		System.out.println("(5)Print User's info");
		System.out.println("(6)Exit");
		System.out.println();
		i = input.nextInt();
		return i;
	}
}
