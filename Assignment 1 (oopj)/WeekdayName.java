class WeekdayName {
    public static void main(String[] args) {
        int weekdayNumber = 3; // Change this number to represent different weekdays (1-7)

        String weekdayName;

        switch (weekdayNumber) {
            case 1:
                weekdayName = "Monday";
                break;
            case 2:
                weekdayName = "Tuesday";
                break;
            case 3:
                weekdayName = "Wednesday";
                break;
            case 4:
                weekdayName = "Thursday";
                break;
            case 5:
                weekdayName = "Friday";
                break;
            case 6:
                weekdayName = "Saturday";
                break;
            case 7:
                weekdayName = "Sunday";
                break;
            default:
                weekdayName = "Invalid weekday number";
                break;
        }

        System.out.println("Weekday name: " + weekdayName);
    }
}
