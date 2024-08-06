import java.util.Arrays;

class MergeSort {
public void merger(int[] arr, int s, int mid, int e) {
        int[] joined = new int[e - s];
        int i = s, j = mid, k = 0;
        
        while (i < mid && j < e) {
            if (arr[i] <= arr[j]) {
                joined[k++] = arr[i++];
            } else {
                joined[k++] = arr[j++];
            }
        }
        
        while (i < mid) {
            joined[k++] = arr[i++];
        }
        
        while (j < e) {
            joined[k++] = arr[j++];
        }
        
        for (k = 0; k < joined.length; k++) {
            arr[s + k] = joined[k];
        }
    }
    
    void divider(int[] arr, int start, int end) {
        if (end - start <= 1)
            return; 
        
        int mid = (start + end) / 2;
        
        divider(arr, start, mid);
        divider(arr, mid, end);
        
        merger(arr, start, mid, end);
    }
}

public class MyClass {
    public static void main(String[] args) {
        int[] test = {4,4, 1, 3, 9, 7};
        MergeSort ms = new MergeSort();
        ms.divider(test, 0, test.length);
        System.out.println("After sort: " + Arrays.toString(test));
    }
}
