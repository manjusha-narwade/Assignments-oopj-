import java.util.Scanner;

class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the year
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        
        // Close the scanner
        scanner.close();
        
        // Check if the year is a leap year using if-else
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year (using if-else).");
        } else {
            System.out.println(year + " is not a leap year (using if-else).");
        }
        
        // Check if the year is a leap year using switch-case
        int remainder4 = year % 4;
        int remainder100 = year % 100;
        int remainder400 = year % 400;
        
        switch (remainder4) {
            case 0:
                switch (remainder100) {
                    case 0:
                        switch (remainder400) {
                            case 0:
                                System.out.println(year + " is a leap year (using switch-case).");
                                break;
                            default:
                                System.out.println(year + " is not a leap year (using switch-case).");
                                break;
                        }
                        break;
                    default:
                        System.out.println(year + " is a leap year (using switch-case).");
                        break;
                }
                break;
            default:
                System.out.println(year + " is not a leap year (using switch-case).");
                break;
        }
    }
}
