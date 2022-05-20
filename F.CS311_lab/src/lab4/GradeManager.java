package lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * A GradeManager will create a command-line prompt that will let someone add
 * grades and display grades in histogram format.
 * 
 */

public class GradeManager {

	// Keeps track of the number of each grade this has
	private HashMap<LetterGrade, Integer> allGrades;

	/**
	 * Creates a new GradeManager.
	 */
	public GradeManager() {
		// Create a new HashMap of the grades
		this.allGrades = new HashMap<LetterGrade, Integer>();

		// Add in all grades and set the occurance to 0
		for (LetterGrade gl : LetterGrade.values()) {
			allGrades.put(gl, 0);
		}
	}

	/**
	 * Adds grade to this GradeManager.
	 * 
	 * @param grade - grade to add to this grad manager
	 */
	public void addGrade(String grade) throws InvalidGradeException {
		if (grade.equals("a")) {
			this.allGrades.put(LetterGrade.A, this.allGrades.get(LetterGrade.A) + 1);
		} else if (grade.equals("b")) {
			this.allGrades.put(LetterGrade.B, this.allGrades.get(LetterGrade.B) + 1);
		} else if (grade.equals("c")) {
			this.allGrades.put(LetterGrade.C, this.allGrades.get(LetterGrade.C) + 1);
		} else if (grade.equals("d")) {
			this.allGrades.put(LetterGrade.D, this.allGrades.get(LetterGrade.D) + 1);
		} else if (grade.equals("f")) {
			// TODO: YOUR CODE HERE
			this.allGrades.put(LetterGrade.F, this.allGrades.get(LetterGrade.F) + 1);
		} else {
			throw new InvalidGradeException("Invalid grade!!!");
		}

		// If grade doesn't match a valid grade, throw an InvalidGradeException
	}

	/**
	 * Prints out a histogram of the grades to the console.
	 *
	 */
	public void printHistogram() {
		// TODO: YOUR CODE HERE
		int max = this.allGrades.get(LetterGrade.A);
		for (LetterGrade gl : LetterGrade.values()) {
//			if(max < this.allGrades.get(gl))
//				max = this.allGrades.get(gl);
			System.out.println(gl + ": " + this.allGrades.get(gl));
		}
		throw new RuntimeException("GradeManger.printHistogram() not yet implemented!");
	}

	/**
	 * Returns a string representation of the histogram of the grades.
	 * 
	 * @return a string representation of the histogram of the grades.
	 */
	public String getHistString() {
		StringBuffer sb = new StringBuffer();
		for (LetterGrade gl : LetterGrade.values()) {
			sb.append(gl + ":");
			for (int i = 0; i < this.allGrades.get(gl); i++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	/**
	 * Simple loop that accepts 3 commands from System.in: add <some grade> : for
	 * example, "add a" or "add b" adds the given grade to the GradeManager print :
	 * prints out all the grades in this GradeManager in a histogram format exit :
	 * exits the program
	 * 
	 * @param args
	 */
	// Get grade function
	public HashMap<LetterGrade, Integer> getAllGrades() {
		return allGrades;
	}

	public static void main(String[] args) {
		GradeManager gm = new GradeManager();
		BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Starting the grade manager");
		System.out.println();
		while (true) {
			System.out.println("start");
			String input;
			try {
				input = cin.readLine();
				if (input.startsWith("add")) {
					// TODO: YOUR CODE HERE
					System.out.println("add");	
					String a = cin.readLine();
					try {
						gm.addGrade(a);
					} catch (InvalidGradeException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
				} else if (input.equals("print")) {
					// TODO: YOUR CODE HERE
					gm.printHistogram();
					System.out.println("print");
					System.out.println(gm.getHistString());
				} else if (input.equals("exit")) {
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}