public class pract{
    public static void main(String[] args) {
        int[] arr = {20,19,18,17,16,15,14,13,12};
        selectionSort(arr);

        // Print the sorted array

    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            System.out.println("pass number : "+i+"----------**");
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    for (int num : arr) {
                        System.out.print(num + "--");
                    }
                }

            }
        }
    }
}
