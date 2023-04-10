
public class User {

	private final Long id;
	private String fullName;
	private final String password;
	private final String email;

	public User(Long id, String fullName, String password, String email) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.password = password;
		this.email = email;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Long getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", password=" + password + ", email=" + email + "]";
	}



}
