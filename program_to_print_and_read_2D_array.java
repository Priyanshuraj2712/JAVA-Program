import java.util.Scanner;
class Arrayread{
 public static void printArray(int[][] arr) {
 for (int i = 0; i < arr.length; i++) {
 for (int j = 0; j < arr[i].length; j++) {
 System.out.print(arr[i][j] + " ");
 }
 System.out.println();
 }
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter number of rows: ");
 int rows = sc.nextInt();
 System.out.print("Enter number of columns: ");
 int cols = sc.nextInt();
 int[][] arr = new int[rows][cols];
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 System.out.print("Enter element at [" + i + "][" + j + "]: ");
 arr[i][j] = sc.nextInt();
 }
 }
 System.out.println("Original array:");
 printArray(arr);
 } 
}
