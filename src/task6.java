import java.util.Random;

public class task6 {
    public static void main(String[] args) {
        // Визначення кількості стрічок з різною кількістю стовбців
        int[][] array = new int[15][];

        // Наповнення масиву випадковими значеннями цілих чисел з відрізку [0; 15]
        for (int i = 0; i < array.length; i++) {
            if (i < 4) {
                array[i] = generateRandomRow(5);
            } else if (i < 8) {
                array[i] = generateRandomRow(8);
            } else if (i < 12) {
                array[i] = generateRandomRow(3);
            } else {
                array[i] = generateRandomRow(9);
            }
        }

        // Виведення масиву у консоль
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Метод для генерації випадкового рядка з заданою кількістю стовбців
    public static int[] generateRandomRow(int columns) {
        Random random = new Random();
        int[] row = new int[columns];
        for (int i = 0; i < columns; i++) {
            row[i] = random.nextInt(16); // Генерація чисел від 0 до 15
        }
        return row;
    }
}
