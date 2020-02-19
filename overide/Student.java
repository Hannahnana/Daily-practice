package overide;

public class Student {
	private String name;
	private int age;
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//对Object中的equals方法进行重写
	//以下是重写前的实现
//	public boolean equals(Object obj) {
//        return (this == obj);
//    }
	@Override
	/*
	重写equals方法
	我们可以参考String类对其重写的方式：
	1.如果两个对象就是同一对象那么返回true
	2.如果被比较的对象不存在或者两个对象不是同一个类型则返回false
	3.比较对象中包含的成员变量值是否相同（其中String类型的成员变量的比较需要借助String的equals方法）
	*/
	public boolean equals(Object obj) { 
		if(this == obj) return true;  //同一个对象
		if(obj==null||this.getClass()!=obj.getClass()) return false;  //不属于一个类
		Student student = (Student) obj;
//		if(this.name!=student.name) return false; 错误的写法
		//对于String类型的变量的比较，要调用String里的equals方法以及判断是否为空
		if (this.name != null ? !name.equals(student.name) : student.name != null)
		//数值型数字直接用==比较
		if(this.age!=student.age) return false;
		return true;
	}
	//重写equals()的同时必须对hashCode进行重写
	/*​ 同时Java标准中对hashcode有如下的规定：
		在java应用程序执行期间，如果在equals方法比较中所用的信息没有被修改，那么在同一个对象上多次调用hashCode方法时必须一致地返回相同的整数。
		如果多次执行同一个应用时，不要求该整数必须相同。
		如果两个对象通过调用equals方法是相等的，那么这两个对象调用hashCode方法必须返回相同的整数。
		如果两个对象通过调用equals方法是不相等的，不要求这两个对象调用hashCode方法必须返回不同的整数。
	*/
	@Override
	public int hashCode() {
		int result = age;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;  //把散列值和所有成员变量的值联系到一起
	}
}
