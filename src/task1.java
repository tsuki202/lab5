public class task1 {
    public static void main(String[] args) {
            int size = 50; // array size
            int[] oddNumbers = new int[size]; // create array

            // filling an array with odd numb from 1 to 99
            for (int i = 0, num = 1; i < size; i++, num += 2) {
                oddNumbers[i] = num;
            }

            // print array elements in a column
            for (int i = 0; i < size; i++) {
                System.out.println(oddNumbers[i]);
            }
        }
    }

