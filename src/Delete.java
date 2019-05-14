import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int[] array = {1, 5, 6, 4, 8, 0, 0};
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value to delete :");
        x = scanner.nextInt();
        if (findInArr(x, array) != -1) {
            System.out.println("Found " + x + "at position " + findInArr(x, array));
        } else {
            System.out.println("Invalid Input");
        }
        int index = findInArr(x, array);
        deleteElement(index, array);
        displayArr(array);

    }

    private static int findInArr(int x, int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == x) {
                index = i;
            }
        }
        return index;
    }

    private static void deleteElement(int index, int[] arr) {
        for (int i = index; i < arr.length -1; i++) {
            arr[i] = arr[i + 1];
        }
    }

    private static void displayArr(int[] arr) {
        System.out.println("Array:");
        for (int i = 0; i < arr.length -1; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
