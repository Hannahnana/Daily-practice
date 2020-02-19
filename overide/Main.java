package overide;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println(s1.equals(s2)); //String类中重写了equals方法
		System.out.println(s1.hashCode()); //String类也重写了hashcode()方法，所以这两个对象的散列值也是一样的
		System.out.println(s2.hashCode());
		
		Student p1 = new Student("小柯",25);
		Student p2 = new Student("小柯",25);
		System.out.println(p1.equals(p2)); //如果在类Student中没有重写equals()方法，那么这里的equals方法相当于==判断的是这两个对象是不是同一个对象，结果就是false
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
	}

}
