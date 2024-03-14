public class Assignment3_3 {
    public static void main(String[] args) {
        // Declare and initialize variables of different data types
        int intValue = 10;
        double doubleValue = 6.5;
        float floatValue = 3.3f;

        // Perform arithmetic operations involving different data types
        double result1 = intValue + doubleValue; // int is widened to double
        float result2 = floatValue * intValue;   // int is widened to float
        double result3 = doubleValue / floatValue; // float is widened to double

        // Print the results
        System.out.println("Result of int + double: " + result1);
        System.out.println("Result of float * int: " + result2);
        System.out.println("Result of double / float: " + result3);
    }
}

    

