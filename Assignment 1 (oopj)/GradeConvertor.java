import java.util.Scanner;
class GradeConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the numerical grade
        System.out.print("Enter the numerical grade: ");
        double numericalGrade = scanner.nextDouble();
        
        // Close the scanner
        scanner.close();
        
        // Convert numerical grade to letter grade using if-else statements
        String letterGrade;
        if (numericalGrade >= 90) {
            letterGrade = "A";
        } else if (numericalGrade >= 80) {
            letterGrade = "B";
        } else if (numericalGrade >= 70) {
            letterGrade = "C";
        } else if (numericalGrade >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        
        // Output the corresponding letter grade
        System.out.println("The corresponding letter grade is: " + letterGrade);
    }
}



