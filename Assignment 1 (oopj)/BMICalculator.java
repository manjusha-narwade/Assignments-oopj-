import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Classify BMI into categories
        String bmiCategory;
        if (bmi < 18.5) {
            bmiCategory = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            bmiCategory = "Normal weight";
        } else {
            bmiCategory = "Overweight";
        }

        // Display the BMI and category
        System.out.println("Your BMI is: " + bmi);
        System.out.println("BMI Category: " + bmiCategory);

        scanner.close();
    }
}
