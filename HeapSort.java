public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(arr);
        heapSort(arr);
        System.out.println("Sorted array (ascending order):");
        printArray(arr);
    }
    public static void heapSort(int[] arr) {
        int n = arr.length;
        // Build a max-heap (ascending order)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        // Extract elements from the heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Swap the root (max element) with the last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // Call heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
    public static void heapify(int[] arr, int n, int rootIndex) {
        int largest = rootIndex;
        int leftChildIndex = 2 * rootIndex + 1;
        int rightChildIndex = 2 * rootIndex + 2;
        // If left child is larger than root
        if (leftChildIndex < n && arr[leftChildIndex] > arr[largest]) {
            largest = leftChildIndex;
        }
        // If right child is larger than largest so far
        if (rightChildIndex < n && arr[rightChildIndex] > arr[largest]) {
            largest = rightChildIndex;
        }
        // If the largest element is not the root, swap them
        if (largest != rootIndex) {
            int swap = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = swap;
System.out.println(arr[rootIndex] +"  "+ arr[largest]);
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
