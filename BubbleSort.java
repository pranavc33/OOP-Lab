import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
   int[] arr={23, 45, 56 , 67, 78, 89};
   bubble(arr);
        System.out.println(Arrays.toString(arr));

    }


static void bubble(int[] arr) {
        boolean swapped;

    for (int i = 0; i < arr.length; i++) {
        for (int j = 1; j < arr.length - i; j++) {
            // swap if item is smaller than previous item//
            if (arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;


            }
        }
           }
        }
    }
