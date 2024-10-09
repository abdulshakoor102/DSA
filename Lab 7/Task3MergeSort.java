public class Task3MergeSort {

    void Split(int arr[], int l, int r) {

        if (l < r) {

            int mid = (l + r) / 2;


            Split(arr, l, mid);


            Split(arr, mid + 1, r);


            Merge(arr, l, mid, r);
        }
    }


    void Merge(int arr[], int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;


        int left[] = new int[n1];
        int right[] = new int[n2];


        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }


        int i = 0, j = 0;
        int k = l;


        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }


        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }


        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }


    void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Task3MergeSort ms = new Task3MergeSort();
        

        int arr[] = {4,6,1,7,9,3,2};


        System.out.print("Original Array: ");
        ms.display(arr);
        System.out.println();


        ms.Split(arr, 0, arr.length - 1);


        System.out.print("After Merge Sort: ");
        ms.display(arr);
        System.out.println();
    }
}
