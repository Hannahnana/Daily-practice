package SerizableTest;

import java.io.Serializable;
/*
  Serializable练习
  Serializable是Java提供的序列化接口，是一个空接口，为对象提供标准的序列化与反序列化操作。
  
  序列化就是将一个对象的状态（各个属性量）保存起来，然后在适当的时候再获得。序列化分为两大部分：序列化和反序列化。
  序列化是这个过程的第一部分，将数据分解成字节流，以便存储在文件中或在网络上传输。(把对象转化为字节序列)
  反序列化就是打开字节流并重构对象。对象序列化不仅要将基本数据类型转换成字节表示，有时还要恢复数据。恢复数据要求有恢复数据的对象实例（字节序列恢复为对象）
 
 */
public class Student implements Serializable{
	private int id;
	private String name;
	private String sex;
	//原则上序列化后的数据当中的serialVersionUID与当前类当中的serialVersionUID一致，那么该对象才能被反序列化成功。
	 //如果反序列化一直不成功，说明当前类跟序列化后的类发生了变化，比如是成员变量的数量或者是类型发生了变化。
	private static final long serialVersionUID =32832092390L;
	 
	public Student(int id, String name, String sex) {
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
