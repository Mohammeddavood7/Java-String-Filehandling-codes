package Com.march22.SerialiazableQ;

import java.io.Serializable;


public class Person implements Serializable
{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int age ;
	private String email;
	private boolean flag;
	public Person(String name, int age,String email) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", email=" + email + " , flag="+flag+"]";
	}
	
	
	
	
	
	

}



























































































