public class ex001 {
    public static void main(String[] args) {
        checkNumber(1);
        System.out.println(toMilesPerHour(95.75));
        printMegaBytesAndKiloBytes(2500);
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(1600));
        System.out.println("areEqualByThreeDecimalPlaces: "+areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println("hasTeen: "+hasTeen(9, 99, 19));
        System.out.println("hasTeen: "+hasTeen(22, 23, 34));
        printYearsAndDays(561600);
    }
    public static void checkNumber (int number){
        if (number > 0){
            System.out.println("positive");
        } else if (number < 0){
            System.out.println("negative");
        } else System.out.println("zero");
    }

    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1L;
        } else {
            double value = kilometersPerHour * 0.621;
            return Math.round(value);
        }
    }

    public static void printConversion (double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }

    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megabytes = kiloBytes / 1024;
            int remainingKilobytes = kiloBytes % 1024;
            System.out.println( (long) kiloBytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else return barking && (hourOfDay < 8 || hourOfDay > 22);
    }

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year > 9999) {
            return false;
        } else return ((year % 4) == 0 && !(year % 100 == 0)) || ((year % 4) == 0 &&  (year % 100) == 0 && (year % 400) == 0) ;
    }

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        return (long) (number1 * 1000) == (long) (number2 * 1000);
    }

    public static boolean hasEqualSum(int number1, int number2, int number3) {
        return (number1 + number2 == number3);
    }

    public static boolean hasTeen(int number1, int number2, int number3) {
        return ((number1 >= 13 && number1 <= 19) ||
                (number2 >= 13 && number2 <= 19) ||
                (number3 >= 13 && number3 <= 19));
    }

    public static boolean isTeen (int number) {
        return (number >= 13 && number <= 19);
    }

    public static double area(double radius) {
        if (radius < 0) return -1;
        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) return -1;
        return x * y;
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) System.out.println("Invalid Value");
        else {
            long finalMinutes = minutes;
            long days = 0;
            long years = 0;
            while (minutes >= 525600) {
                minutes -= 525600;
                years++;
            }
            while (minutes >= 1440) {
                minutes -= 1440;
                days++;
            }
            System.out.println(finalMinutes + " min = " + years + " y and " + days + " d");
        }
    }

    public static void printEqual(int num1, int num2, int num3) {
        if (num1 < 0 || num2 < 0 || num3 < 0) {
            System.out.println("Invalid Value");
        } else if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num1 != num3 && num2 != num3) {
            System.out.println("All numbers are different");
        } else System.out.println("Neither all are equal or different");
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer && (temperature >= 25 && temperature <= 45)) {
            return true;
        } else if (!summer && (temperature >= 25 && temperature <= 35)) {
            return true;
        } else return false;
    }
}
