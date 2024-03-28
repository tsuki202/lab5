import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        // create and fill first two arrays
        int[] array1 = generateRandomArray(10);
        int[] array2 = generateRandomArray(10);

        // output first two arrays to the console
        System.out.println("first array:");
        printArray(array1);
        System.out.println("\nsecond array:");
        printArray(array2);

        //create third array for sum elements first two arrays
        int[] sumArray = new int[10];
        for (int i = 0; i < 10; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        // output first two arrays to the console
        System.out.println("\nthird array:");
        printArray(sumArray);
    }

    // generate array with random int values from 0 to 10
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(11); // generate numbs from 0 to 10
        }
        return array;
    }

    // output an array to the console
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
