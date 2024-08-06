import java.util.Arrays;

// QuickSort class that contains the sort method
class QuickSort {
    
    // Method to perform the QuickSort
    void sort(int[] arr, int low, int high) {
        // Base condition to end the recursion
        if (low >= high)
            return;
        
        // Initializing start and end pointers
        int s = low;
        int e = high;
        
        // Choosing the middle element as the pivot
        int mid = (s + e) / 2;
        int pivot = arr[mid];
        
        // Partitioning the array around the pivot
        while (s <= e) {
            // Move the start pointer to the right until an element greater than pivot is found
            while (arr[s] < pivot) {
                s++;
            }
            // Move the end pointer to the left until an element less than pivot is found
            while (arr[e] > pivot) {
                e--;
            }
            
            // Swap the elements at start and end pointers if start is less than or equal to end
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        
        // Recursively sort the left partition 
         //why e means during increment s cross the e like low ->e->s->high
        sort(arr, low, e);
        // Recursively sort the right partition
        sort(arr, s, high);
    }
}

public class MyClass {
    public static void main(String[] args) {
        // Sample array to sort
        int[] test = {4, 4, 1, 3, 9, 7};
        
        // Creating an instance of QuickSort
        QuickSort qs = new QuickSort();
        
        // Calling the sort method with the array, start index, and end index
        qs.sort(test, 0, test.length - 1);
        
        // Printing the sorted array
        System.out.println("After sort: " + Arrays.toString(test));
    }
}
