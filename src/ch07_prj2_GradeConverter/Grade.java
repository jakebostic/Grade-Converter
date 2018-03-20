package ch07_prj2_GradeConverter;

public class Grade {
	private int number;

	public Grade() {
		number = 0;
	}
	
	public Grade(int n) {
		number = n;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	/* Outward bounds (greater than 100, less than zero) 
	 * are not tested here because we assume all input 
	 * is done using Console class.
	 */
	public String getLetter() {
		String letterGrade = "";
		
		if (number >= 88 )
			letterGrade = "A";
		else if (number >= 80 )
			letterGrade = "B";
		else if (number >= 68 )
			letterGrade = "C";
		else if (number >= 60 )
			letterGrade = "D";
		else 
			letterGrade = "F";
		
		return letterGrade;
	}

}
