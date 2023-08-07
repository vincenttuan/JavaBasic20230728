package day4;

public class Test1 {

	public static void main(String[] args) {
		String id = "A298765432";
		char sex = id.charAt(1);
		System.out.printf("%c\n", sex);

		switch(sex) {
			case '1':
				System.out.println("man");
				break;
			case '2':
				System.out.println("female");
				break;
			default:
				System.out.println("error");	

		}

	}

}