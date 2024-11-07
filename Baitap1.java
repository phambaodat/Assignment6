
package baitap1;
import java.util.Scanner;
public class Baitap1 {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

       
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int largest = array[0];
        int smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        scanner.close();
    }
}