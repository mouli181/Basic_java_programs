import java.util.Scanner;

public class ArrayEx1 {
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
        for(int i= arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }

    }
}
