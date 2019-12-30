package SerizableTest;
import java.io.*;
import SerizableTest.Student;


public class TestObjSerializeAndDeserialize  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toSerial();
//		fromSerial();
	}

	//序列化
	//序列化就是将一个对象的状态（各个属性量）保存起来
	public static void toSerial() { //静态方法不需要实例化对象，就可以直接调用
		Student s = new Student(1,"小明","男");
		try {
			ObjectOutputStream objectoutputstream = new ObjectOutputStream(new FileOutputStream("C:/obj.txt"));
			objectoutputstream.writeObject(s);
			objectoutputstream.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//反序列化
	public static void fromSerial() {
		try{
			ObjectInputStream objinput = new ObjectInputStream(new FileInputStream("C:/obj.txt"));
			try {
				Object object = objinput.readObject();
				Student s1 =(Student)object;
				System.out.print(s1);
				}catch(ClassNotFoundException e){
					e.printStackTrace();
				}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
