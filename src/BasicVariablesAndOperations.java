public class BasicVariablesAndOperations {

    // Write a program to swap two variables without using a temporary variable.
    private static void swapping(int a, int b) {
        // way 1.
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + "\n" + "b = " + b);

        // way 2.
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a = " + a + "\n" + "b = " + b);
    }

    // Calculate the area and perimeter of a rectangle given its length and width.
    private static void rectangle(int width, int length) {
        int area = width * length;
        int perimeter = 2 * (length + width);
        System.out.println("area = " + area + "\n" + "perimeter = " + perimeter);
    }


    private static void avg(int a, int b, int c) {
        // Calculate the average of three numbers.
        int avg = (a + b + c) / 3;
        System.out.println("average = " + avg);

        // Find the maximum values among three numbers
        if (a < b && a < c) {
            System.out.println("minimum = " + a);
        } else if (b < a && b < c) {
            System.out.println("minimum = " + b);
        } else System.out.println("minimum = " + c);

        // Find the minimum values among three numbers
        if (a > b && a > c) {
            System.out.println("maximum = " + a);
        } else if (b > a && b > c) {
            System.out.println("maximum = " + b);
        } else System.out.println("maximum = " + c);

        // Check if a number is even or odd.
        if (a / 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is  odd");
        }
    }

    private static void leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static void main(String[] arg) {
        swapping(10, 4);
        rectangle(12, 15);
        avg(5, 20, 25);
        leapYear(2000);
    }
}
