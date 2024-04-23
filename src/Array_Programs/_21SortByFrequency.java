package Array_Programs;

public class _21SortByFrequency {
    public static void main(String[] args) {
        int arr[] = {12, 11, 22, 12, 12, 30, 20, 20};
        sortByFrequency(arr);
        printArray(arr);
    }

    public static void sortByFrequency(int arr[]) {
        int n = arr.length;

        // Step 1: Count frequency of each element
        int frequency[] = new int[n];
        boolean counted[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                frequency[i] = count;
            }
        }

        // Step 2: Sort the array based on frequency
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (frequency[i] < frequency[j] || (frequency[i] == frequency[j] && arr[i] > arr[j])) {
                    // Swap elements if frequency of arr[i] is less than frequency of arr[j]
                    // OR if frequencies are same but arr[i] is greater than arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    int tempFreq = frequency[i];
                    frequency[i] = frequency[j];
                    frequency[j] = tempFreq;
                }
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
