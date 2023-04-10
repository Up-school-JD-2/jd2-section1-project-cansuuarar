import java.util.Scanner;

public class UserManager {

	public User[] users = new User[5];

	private int userCount = 0;

	public User currentUser = null;
	
	Scanner sc = new Scanner(System.in);

	

	public void createUser(Long id, String userName, String email, String password) {

		users[userCount] = new User(id, userName, password, email);
		userCount++;

		System.out.println(userName + " is created");

	}
	
	
	public User userLogin(String email, String password) {

		for (User user : users) {
			if (user.getEmail().equalsIgnoreCase(email) && user.getPassword().equalsIgnoreCase(password)) {
				currentUser = user;
				System.out.println(currentUser + " logon succesfully.");
				return currentUser;
			}
		}
		
		return currentUser;
		
		
	}

	

	public String deleteUser(String userName) {
		int index = -1;
		String deletedUser = null;

		for (int i = 0; i < userCount; i++) {
			if (users[i].getFullName().equalsIgnoreCase(userName)) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			for (int i = index; i < userCount; i++) {
				users[i] = users[i + 1];
			}
			users[userCount - 1] = null;
			deletedUser = userName;
			userCount--;

		} else {
			System.out.println("user couldnt find");
		}
		return deletedUser;
	}

	public User searchUser(String userName) {
		User searchedUser = null;
		for (User u : users) {
			if (u.getFullName().equalsIgnoreCase(userName)) {
				searchedUser = (User) u;
				break;
			}
		}
		return searchedUser;
	}

	public void listUsers() {
		for (User user : users) {
			if (user != null) {
				System.out.println(user);
			}

		}
	}
	
	
	public void userLogout() {
		while(true) {
			System.out.println("do you want to exit? Y/N");
			String answer = sc.next();
			if (answer.equalsIgnoreCase("Y")) {
				break;
			}
		}System.out.println("log out.");
		
	}
}
