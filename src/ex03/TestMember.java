package ex03;

class Member {
	// Fields
	private String name;
	private String phone;
	
	// Constructor
	public Member() {
		
	}
	
	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	// Getter / Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// Method
	public void info() {
		System.out.println("이름:" + name + ", 전화:" + phone);
	}
}

public class TestMember {
	public static void main() {
		Member m1 = new Member("손흥민", "010-1111-1111");
		Member m2 = new Member("안정환", "010-1111-2222");
		m1.info();
		m2.info();
		
	}
}
