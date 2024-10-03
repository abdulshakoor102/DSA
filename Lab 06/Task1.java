public class Task1{
    int arr[] = {2,5,4,7,2,0};
    int temp,i,j;

    void insertionSort(){
        System.out.println("Insertion Sort:");
        for (i = 1; i < arr.length; i++) {
            temp = arr[i];
            j = i-1;
            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = temp;
        }
    }

    void selectionSort() {
        System.out.println("Selection Sort:");
        for (i = 0; i < arr.length - 1; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    

    void display(){
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        System.out.println("Original Array:");
        t1.display();
        t1.insertionSort();
        t1.display();
        Task1 tt1 = new Task1();
        System.out.println("Original Array:");
        tt1.display();
        tt1.selectionSort();
        tt1.display();
        
    }
}