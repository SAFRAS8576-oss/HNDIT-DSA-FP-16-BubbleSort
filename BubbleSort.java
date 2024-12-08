package DSA;
import java.util.Arrays;

public class BubbleSort {

   
    public static void main(String[] args) {
      
        int[] arr = {5, 2, 9, 1, 5, 6};
        
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            
            boolean swapped = false;

          
            for (int j = 0; j < n - 1 - i; j++) {
               
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        System.out.println(  Arrays.toString(arr));
        System.out.println( Arrays.toString(arr));
    }
}