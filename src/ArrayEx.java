import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = s.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array values");
        for(int i=0;i< arr.length;i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Array values are");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Reversed Array values are");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Arrays.sort(arr);
        System.out.println("Arrays using sort");
        for(int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();

        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }

        }

        System.out.println("Maximum value in this array is " + max);

        int sum = 0;
        for(int i=0;i< arr.length;i++){
            sum += arr[i];
        }
        System.out.println("sum of array elements is " + sum);
    }
}
