

public interface forNormalUser {
	public int getId();
	public void setId(int id);
	public void PrintUserInfo();
	public void addNewEntry(PhoneBookEntry directory);
	public void editEntry(String firstName, String lastName);
	public void LinearSearch(String pn);
	public void Sort();
}
