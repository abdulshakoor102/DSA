public class Task2 {
    int[] arr = {12, 11, 13, 5, 6, 7};

    void mergeSort(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        for (int currSize = 1; currSize < n; currSize *= 2) {
            for (int leftStart = 0; leftStart < n; leftStart += 2 * currSize) {
                int mid = Math.min(leftStart + currSize - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);
                merge(arr, temp, leftStart, mid, rightEnd);
            }
        }
    }


    void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left; 
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

 
        while (i <= mid) {
            temp[k++] = arr[i++];
        }


        while (j <= right) {
            temp[k++] = arr[j++];
        }


        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }

    void display(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        Task2 t2 = new Task2();
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Original Array:");
        t2.display();
        t2.mergeSort(arr);

        System.out.println("After Merge Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
