package day3;

public class Test2 {
	public static void main(String[] args) {
		
		int age = 10;
		int var = age++ - --age + age--;
		System.out.println(age);
		System.out.println(var);

	}
}