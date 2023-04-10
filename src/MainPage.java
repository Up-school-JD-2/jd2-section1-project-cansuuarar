import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {

		MovieManager movieManager = new MovieManager();
		UserManager userManager = new UserManager();
		Scanner sc = new Scanner(System.in);
		printMainPage();
		int choice = 0;
		String[] actorsName = new String[2];

		do {
			System.out.println("Seçiminiz: ");
			choice = sc.nextInt();
			switch (choice) {

			case 0 -> {
				System.out.println("--------------------");
				System.out.println("User login");
				System.out.print("email address: ");
				String email = sc.next();
				System.out.print("password: ");
				String password = sc.next();
				userManager.userLogin(email, password);
				
				System.out.println("--------------------");
			}

			case 1 -> {

				System.out.println("--------------------");
				System.out.print("please enter user id: ");
				var id = sc.nextLong();
				System.out.print("please enter user name: ");
				sc.nextLine();
				var userName = sc.nextLine();
				System.out.print("please enter user email: ");
				var email = sc.next();
				System.out.print("please enter password: ");
				var password = sc.next();
				userManager.createUser(id, userName, email, password);

				System.out.println("--------------------");
			}

			case 2 -> {
				System.out.println("--------------------");
				System.out.print("please enter movie id: ");
				var movieId = sc.nextLong();

				System.out.print("please enter movie name: ");
				sc.nextLine();
				var movieName = sc.nextLine();

				System.out.print("please enter director name: ");

				var directorName = sc.nextLine();

				System.out.print("please enter actors name: ");
				sc.nextLine();
				for (int i = 0; i < actorsName.length; i++) {
					actorsName[i] = sc.next();

				}
				System.out.print("please enter published date: ");
				var date = sc.nextInt();
				System.out.print("please enter movie information: ");
				sc.nextLine();
				var info = sc.next();
				System.out.print("please enter movie type: ");
				sc.nextLine();
				var type = sc.next();
				sc.nextLine();
				movieManager.addMovie(movieId, movieName, directorName, actorsName, date, info, type);
				System.out.println("--------------------");
			}

			case 3 -> {
				System.out.println("--------------------");
				System.out.print("Please enter the user name that you want to search: ");
				sc.nextLine();
				String userName = sc.nextLine();
				User user = userManager.searchUser(userName);
				if (user == null) {
					System.out.println("User couldnt find.");
					break;
				}
				System.out.println(user);
				System.out.println("--------------------");
			}

			case 4 -> {
				System.out.println("--------------------");
				System.out.print("Please enter the movie that you want to search: ");
				sc.nextLine();
				String movieName = sc.nextLine();
				Movie movie = movieManager.searchMovie(movieName);
				if (movie == null) {
					System.out.println("movie couldt find.");
				}
				System.out.println(movie);
				System.out.println("--------------------");
			}

			case 5 -> {
				System.out.println("--------------------");
				System.out.print("Please enter user name that you want to delete: ");
				sc.nextLine();
				String userName = sc.nextLine();
				String user = userManager.deleteUser(userName);
				if (user == null) {
					System.out.println("user couldnt find2");
				} else {
					System.out.println(user + " is removed");
				}

				System.out.println("--------------------");
			}

			case 6 -> {
				System.out.println("--------------------");
				System.out.print("Please enter movie name that you want to delete: ");
				sc.nextLine();
				String movieName = sc.nextLine();
				String movie = movieManager.removeMovie(movieName);
				if (movie == null) {
					System.out.println(movie + " couldnt find.");
				} else {
					System.out.println(movie + " is removed.");
				}
				System.out.println("--------------------");
			}

			case 7 -> {
				System.out.println("--------------------");
				userManager.listUsers();
				System.out.println("--------------------");
			}

			case 8 -> {
				System.out.println("--------------------");
				movieManager.listMovies();
				System.out.println("--------------------");
			}

			case 9 -> {
				System.out.println("--------------------");
				System.out.println("User logout");
				userManager.userLogout();
				System.out.println("--------------------");
			}
			}
		} while (choice != -1);
	}

	private static void printMainPage() {
		System.out.println("****** MAIN PAGE *******");
		System.out.println("0: User Login");
		System.out.println("1: Create user");
		System.out.println("2: Add Movie");
		System.out.println("3: Search User");
		System.out.println("4: Search Movie");
		System.out.println("5: Delete User");
		System.out.println("6: Delete Movie");
		System.out.println("7: List Users");
		System.out.println("8: List Movies");
		System.out.println("9: User logout");
		

		System.out.println("-1: Exit");
	}
}
