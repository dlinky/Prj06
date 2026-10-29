package ex02;

class Member {
	// Fields
	private String name;
	private String email;
	
	// Constructor
	public Member(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	// Getter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}

	// Setter
	public void setEmail(String email) {
		this.email = email;
	}


	public void info() {
		System.out.println("이름:" + name + ", 이메일:" + email);
	}
}

public class TestMember {
	public static void main() {
		Member m1 = new Member("prooding", "prooding@gmail.com");
		m1.getName();
	}
}
