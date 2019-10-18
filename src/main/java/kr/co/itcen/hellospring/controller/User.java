package kr.co.itcen.hellospring.controller;

public class User {

	// getter 와 Setter가 없으면 외부에서 접근이 안된다.
	private Long no;
	private String email;
	private Integer age;

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", email=" + email + ", age=" + age + "]";
	}

}
