package day4;

public class Test2 {

	public static void main(String[] args) {
		char grade = 'B';
		// A -> Excellent!
		// B -> Well done
		// C -> Well done
		// D -> You passed
		// F -> Better try again
		// default -> Invalid grade
		// use java switch-case
		
		switch(grade) {
			case 'A':
				System.out.println("Excellent");
				break;
			case 'B':
			case 'C':
				System.out.println("Well done");
				break;
			case 'D':
				System.out.println("You passed");
				break;
			case 'F':
				System.out.println("Better try again");
				break;
			default:
				System.out.println("Invalid grade");
		}

	}

}