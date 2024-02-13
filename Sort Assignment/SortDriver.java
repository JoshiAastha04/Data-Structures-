import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Exit");
            System.out.println("2. Bubble Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Selection Sort");
            System.out.println("5. Heap Sort");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Exiting the program.");
                break;
            }

            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            arr = generateRandomArray(size);
            System.out.println("Original Array: " + Arrays.toString(arr));

            switch (choice) {
                case 2:
                    Sort.bubbleSort(arr);
                    break;
                // Add cases for other sort methods if needed

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    continue;
            }

            System.out.println("Sorted Array: " + Arrays.toString(arr));
        }

        scanner.close();
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100); // You can change the range as needed
        }

        return arr;
    }
}
