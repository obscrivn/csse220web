/**
 * Create instances of StudentGradebook and invoke methods on them.
* GOAL
 *  - Store assignment scores in a HashMap<String,Integer> (assignment -> score).
 *  - Print a clean, single-line grade report using only keySet() + get().
 *  - Handle the "no grades yet" case.
 *
 * WHAT YOU MAY USE
 *  - HashMap and its methods: put, get, keySet, size, isEmpty
 *  - Enhanced for-loop over keySet()
 *  - Basic String concatenation and System.out printing
 *  - NO Streams, NO Map.Entry, NO advanced collections! (we have not studied that stuff yet)
 *
 * STEP-BY-STEP
 *  1) Implement StudentGradebook class:
 *     - fields: name, HashMap grades
 *     - addGrade method to put assignment name and score
 *     - printGradeReport(): print "Name: A - 95, B - 88"  or "(no grades yet)" Hint: loop with get
 *     - getAverage(): loop over keySet() and compute average
 *
 *  2) In main:
 *     - TWO students — one with 3 grades, one with NO grades.
 *     - Call printGradeReport() for each to show both cases.
 *
 * EXPECTED EXAMPLE (your numbers/ordering may differ if using HashMap):
 *   John Doe: TwelveProblems - 95, WordGames - 99, Faces - 92 (Average: 95.33)
 *   Pat NoGrades: (no grades yet)
 */

public class StudentGradebookMain {

	/**
	 * Program starts here.
	 * 
	 * @param args
	 *            Ignore the args.
	 */
	public static void main(String[] args) {

		/*
		 TODO: Uncomment this code to get started with StudentGradebook
		 
		 StudentGradebook one = new StudentGradebook("John Doe");
		 StudentGradebook two = new StudentGradebook(); //default name is Studenty McStudenton
		 
		 one.addAssignment("TwelveProblems", 95);

		  
		 one.addAssignment("WordGames", 99);
		 
		 one.addAssignment("Faces", 92);
		  
		 one.printGradeReport(); System.out.println(); //blank line
		 two.printGradeReport();
		
		*/

		/*
		 * This code should print out:
		 * 
		 * John Doe: TwelveProblems - 95 WordGames - 99 Faces - 92
		 * 
		 * Studenty McStudenton: (no grades yet)
		 * 
		 * If no grades, you should be able to check and print:  John Doe: (no grades yet)
		 * add a new method to compute the student's
		 * average and print it as part of printGradeReport. 
		 * 
		 * If you do so it should show the following:
		 * 
		 * John Doe TwelveProblems - 95 WordGames - 99 Faces - 92 - Average: 95.33
		 * 
		 * 
		 */

	}

}
