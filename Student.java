package collection;

public class Student {
	
	private String name;
	private int age;
	private int id;
	private char section;
	private boolean isMale;
	
	
	
	public void setName(String name) {
		this.name = name;
	}	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	
	public void setSection(char section) {
		this.section = section;
	}
	public int getSection() {
		return section;
	}
	
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public boolean isMale() {
		return isMale;
	}
	
	public Student(String name, int age, int id, char section,boolean isMale) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.section = section;
		this.isMale=isMale;
	}
	
	public String toString() {
		return "Name="+name+"Age="+age+"Id="+id+"Section="+section+"isMale="+isMale;
	}
	
}
