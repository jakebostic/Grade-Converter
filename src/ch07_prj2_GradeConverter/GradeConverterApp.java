package ch07_prj2_GradeConverter;


public class GradeConverterApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Letter Grade Converter");
		System.out.println();
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			int numericGrade = Console.getInt("Enter numerical grade: ", 0, 100);
			Grade grade = new Grade(numericGrade);	
			System.out.println("Letter grade = "+grade.getLetter());
		
			choice = Console.getString("Continue? (y/n): ", "y", "n");
		}
		
		System.out.println("Bye!");

		
		}
		
	
	}
	
	

