import com.alibaba.fastjson.JSON;

public class Test {

	public static void main(String[] args) {
		Student student = new Student("yang", 23);
		String str = "{value:[{name: zhangSan,age: 18}]}";
		String jStr = JSON.toJSONString(str);
		System.out.println("str---->" + str);
		System.out.println("jStr---->"+jStr);
		Student s = JSON.parseObject(jStr, Student.class);
		System.out.println(s.name + s.age);
//		System.out.println("json-->" + json);
	}
	static class Student {
		private String name;
		private int age;

		public Student(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}
}
