public class Assignment3_4 {
    public static void main(String[] args) {

        // Widening conversion to double
        int intValue = 30;
        double doubleValue = intValue;
        System.out.println("Widening Conversion from int to double:");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);
        System.out.println();

        // Widening conversion to float
        float floatValue = intValue;
        System.out.println("Widening Conversion from int to float:");
        System.out.println("int value: " + intValue);
        System.out.println("float value: " + floatValue);
        System.out.println();

        // Widening conversion to String
        String stringValue = String.valueOf(intValue);
        System.out.println("Widening Conversion from int to String:");
        System.out.println("int value: " + intValue);
        System.out.println("string value: " + stringValue);
    }
}

    

