package Lec25;

public class Student {
	String name="pooja";
	int age=22;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public Student() {
		// TODO Auto-generated constructor stub

	}

	public void introduceYourself() {
		int roll_number = 2;
		System.out.println("My name is " + this.name + " and age " + this.age + " " + roll_number);
	}

	public void SyaHey(String name) {
		System.out.println(this.name + " say hey " + name);

	}

}
