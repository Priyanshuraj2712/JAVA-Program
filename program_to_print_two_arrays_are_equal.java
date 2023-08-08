import java.util.Scanner;
class Arrayequality{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arrays: ");
        int size = sc.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        System.out.println("Enter the elements of the first array:");
    for (int i = 0; i < size; i++) {
        array1[i] = sc.nextInt();
    }
        System.out.println("Enter the elements of the second array:");
    for (int i = 0; i < size; i++) {
        array2[i] = sc.nextInt();
    }
        System.out.println("The elements of the first array are:");
    for (int i = 0; i < size; i++) {
        System.out.print(array1[i] + " ");
    }
        System.out.println("\nThe elements of the second array are:");
    for (int i = 0; i < size; i++) {
        System.out.print(array2[i] + " ");
    }
        boolean equal = true;
    for (int i = 0; i < size; i++) {
        if (array1[i] != array2[i]) {
            equal = false;
        break;
        }
    }
    if (equal) {
        System.out.println("\nThe two arrays are equal.");
    } else {
        System.out.println("\nThe two arrays are not equal.");
        }
    }
}
