import java.util.Scanner;
class ArrayMenu{
 public static int sumOfElements(int[] arr) {
 int sum = 0;
 for (int element : arr) {
 sum += element;
 }
 return sum;
 }
 public static int sumOfAlternateElements(int[] arr) {
 int sum = 0;
 for (int i = 0; i < arr.length; i += 2) {
 sum += arr[i];
 }
 return sum;
 }
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int[] arr = new int[5];
 System.out.println("Enter the elements of the array:");
 for (int i = 0; i < arr.length; i++) {
 System.out.printf("Enter element %d: ", i + 1);
 arr[i] = sc.nextInt();
 }
 int choice;
 do{
 System.out.println("\nChoose an option:");
 System.out.println("1. Find sum of all elements");
 System.out.println("2. Find sum of alternate elements");
 System.out.println("3. Exit");
 System.out.print("Enter choice from 1-3: ");
 choice = sc.nextInt();
 switch (choice) {
 case 1:
 System.out.println("\nSum of all elements: " + sumOfElements(arr));
 break;
 case 2:
 System.out.println("\nSum of alternate elements: " + sumOfAlternateElements(arr));
 break;
 case 3:
 System.out.println("\nExiting program...");
 break;
 default:
 System.out.println("\nInvalid choice. Please enter a number between 1 and 3.");
 break;
 }
 } while (choice != 3);
 } 
}
