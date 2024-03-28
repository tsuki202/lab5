import java.util.Random;

public class task5 {
    public static void main(String[] args) {
        // create an array with 15 random elements from the interval [0; 10]
        int[] array = generateRandomArray(15);

        // output array
        System.out.println("array:");
        printArray(array);

        // counting the number of paired elements in an array
        int evenCount = countEvenElements(array);

        // notify the user about the number of paired elements in the array
        System.out.println("\nnumber of paired elements in the array: " + evenCount);
    }

    // generate array with random elements from 0 to 10
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(11); // generate numb from 0 to 10
        }
        return array;
    }

    // output array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // counting the number of paired elements in the array
    public static int countEvenElements(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
