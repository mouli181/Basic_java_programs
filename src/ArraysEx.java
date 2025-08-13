public class ArraysEx {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 20;
        arr[1] = 30;
        arr[2] = 40;
        arr[3] = 50;
        arr[4] = 60;

//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        // Enhanced for loop
        for(int a : arr){
            System.out.println(a);
        }


    }
}
