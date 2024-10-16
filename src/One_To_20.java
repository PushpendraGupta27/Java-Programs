import java.util.Arrays;

public class One_To_20 {

    private static void one() {
        // Create an array with 5 integer elements and initialize them to 0.
        int[] a = new int[5];
        System.out.println("Que one-> " + Arrays.toString(a));
    }

    private static void two() {
        // Assign the value 10 to the first element of the array.
        int[] a = new int[5];
        a[0] = 10;
        System.out.println("Que two-> " + Arrays.toString(a));
    }

    private static void three() {
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        // Print the third element of the array.
        System.out.println("Que three-> " + arr[2]);
    }

    private static void four() {
        // Change the value of the second element to 5.
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        arr[1] = 5;
        System.out.println("Que four-> " + Arrays.toString(arr));
    }

    private static void five() {
        // Print all elements of the array using a loop.
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        System.out.print("Que five-> ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static void six() {
        // Calculate the sum of all elements in the array.
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        int sum = 0;
        for (int i : arr) {
            sum = i + sum;
        }
        System.out.println("Que six-> Sum of the all elements of Array is: " + sum);
    }

    private static void seven() {
        // Find the largest element in the array.
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        int largest = arr[0];
        for (int i : arr) {
            if (largest < i) {
                largest = i;
            }
        }
        System.out.println("Que seven-> The largest element in the array: " + largest);
    }

    private static void eight() {
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        // Find the smallest element in the array.
        int smallest = arr[0];
        for (int i : arr) {
            if (i < smallest) {
                smallest = i;
            }
        }
        System.out.println("Que eight-> The smallest element in the array: " + smallest);
    }

    private static void nine() {
        // Double the value of each element in the array.
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        System.out.print("Que nine-> ");
        for (int i : arr) {
            i = 2 * i;
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void ten() {
        // Reverse the elements of the array.
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        System.out.print("Que ten-> ");
        int temp;
        for (int i = 0; i <= arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void eleven() {
        // Check if the array contains the value 7.
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        for (int i : arr) {
            if (i == 7) {
                System.out.println("Que eleven-> yes the array contains the value 7.");
                return;
            }
        }
    }

    private static void twelve() {
        // Replace all occurrences of 3 with 0 in the array.
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {
                arr[i] = 0;
            }
        }
        System.out.println("Que twelve-> " + Arrays.toString(arr));
    }

    private static void thirteen() {
        // Remove the first element of the array.
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        int[] newArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        System.out.println("Que thirteen.1-> " + Arrays.toString(newArr));

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        System.out.println("Que thirteen.2-> " + Arrays.toString(arr));
    }

    private static void fourteen() {
        // Add a new element with the value 8 to the end of the array.
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length - 1] = 8;
        System.out.println("Que fourteen-> " + Arrays.toString(newArr));
    }

    private static void fifteen() {
        // Sort the array in ascending order.
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        for (int i = 0; i < arr.length - 1; i++) { // Brute force: Bubble Sort algorithm
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Que fifteen-> " + Arrays.toString(arr));
    }

    private static void sixteen() {
        // Create a copy of the array.
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        // by using in build function.
        /*System.arraycopy(arr, 0, newArr, 0, arr.length);*/
        System.out.println("Que sixteen-> " + Arrays.toString(newArr));
    }

    private static void seventeen() {
        // Clear all elements of the array.
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        // by using in build function.
        /*Arrays.fill(arr, 0);*/
        System.out.println("Que seventeen-> " + Arrays.toString(arr));
    }

    private static void eighteen() {
        // Check if the array is empty.
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        if (arr != null) {
            System.out.println("Que eighteen-> Array is not empty");
        } else {
            System.out.println("Que eighteen-> Array is not empty");
        }
    }

    private static void nineteen() {
        // Find the index of the element with the value 5.
        int[] arr = {1, 4, 3, 8, 5, 2, 6, 7, 8, 3, 9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                System.out.println("Que nineteen-> Index of 5 is: " + i);
            }
        }
    }

    private static void twenty() {
        // Concatenate two arrays into a new array.
        int[] a = {1, 4, 3, 8, 5, 2};
        int[] b = {6, 7, 8, 3, 9};
        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            c[a.length + j] = b[j];
        }
        System.out.println("Que twenty-> " + Arrays.toString(c));
    }

    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
        six();
        seven();
        eight();
        nine();
        ten();
        eleven();
        twelve();
        thirteen();
        fourteen();
        fifteen();
        sixteen();
        seventeen();
        eighteen();
        nineteen();
        twenty();
    }
}