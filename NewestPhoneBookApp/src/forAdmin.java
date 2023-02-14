

public interface forAdmin {
	public String getEmailAddress();
	public void setEmailAddress(String emailAddress);
	public void PrintUserInfo();
	public void addNewEntry(PhoneBookEntry directory);
	public void editEntry(String firstName, String lastName);
	public void delete(String f, String l);
	public void sortByBinary(int c);
	public void changeUsername(String newName);
	public void changePassword(String newPassword);
	public void LinearSearch(String pn);
	public void Sort();
}
