import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        // create and fill 3 args
        int[] array1 = generateRandomArray(5);
        int[] array2 = generateRandomArray(5);
        int[] array3 = generateRandomArray(5);

        // output array in console
        System.out.println("first array:");
        printArray(array1);
        System.out.println("\nsecond array:");
        printArray(array2);
        System.out.println("\nthird array:");
        printArray(array3);

        // calculating the average value for each array
        double average1 = calculateAverage(array1);
        double average2 = calculateAverage(array2);
        double average3 = calculateAverage(array3);

        // compare average values and display the result
        if (average1 > average2 && average1 > average3) {
            System.out.println("\naverage value of the first array bigger.");
        } else if (average2 > average1 && average2 > average3) {
            System.out.println("\naverage value of the second array bigger.");
        } else if (average3 > average1 && average3 > average2) {
            System.out.println("\naverage value of the third array bigger.");
        } else {
            System.out.println("\naverage value of arrays are equal.");
        }
    }// generate an array with random int values from 0 to 5
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(6); // generate numb for o to 5
        }
        return array;
    }

    // output an array to the console
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // calculating the average value of an array
    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}

