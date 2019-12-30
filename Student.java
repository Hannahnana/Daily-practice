package my_first_package;

class Students{
	private int id;
	private String name;
	private String sex;
	
	
	public Students(int id, String name, String sex) {
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex() {
		this.sex = sex;
	}
	// Java中所有类都默认继承Object类，toStrong()方法是Object类里的一个实例方法，所以所有Java对象都有toString()方法
	// toString()方法是一个“自我描述”的方法，当输出某实例对象时，可以通过重写自定义等方式为对象实现输出自我描述的信息
	public String toString() {
		return "stuent类，{id=" +id+",name="+name+",sex="+sex+"}";
	}
}
public class Student{
	public static void main(String[] args) {
		Students s = new Students(1,"a","male");
		s.setId(2);
		System.out.println(s.getId());
		System.out.print(s.toString());
	}
}
