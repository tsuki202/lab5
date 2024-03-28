import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        int[] numbers = new int[20]; //create array with 20 elements

        // filling an array with random int numb from 0 to 9
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        // output the initial array
        System.out.println("initial array:");
        printArray(numbers);

        //  replace each element with an odd index with zero
        for (int i = 1; i < numbers.length; i += 2) {
            numbers[i] = 0;
        }

        // print new array
        System.out.println("\nupdated array:");
        printArray(numbers);
    }

    // output an array to the console
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}