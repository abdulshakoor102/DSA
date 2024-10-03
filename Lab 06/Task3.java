public class Task3 {
    int arr[] = {4,3,2,1};
    int i,temp,cp=0;
    void sort() {

        if (arr[0] > arr[1]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
            System.out.println("Comparision of " + arr[0] + " and " + arr[1]);
            cp++;
        }
        if (arr[2] > arr[3]) {
            int temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
            System.out.println("Comparision of " + arr[2] + " and " + arr[3]);
            cp++;
        }
    

        if (arr[1] > arr[2]) {

            int temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
            System.out.println("Comparision of " + arr[1] + " and " + arr[2]);
            cp++;
            if (arr[0] > arr[1]) {
                temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
                System.out.println("Comparision of " + arr[0] + " and " + arr[1]);
            cp++;
            }
            if (arr[2] > arr[3]) {
                temp = arr[2];
                arr[2] = arr[3];
                arr[3] = temp;
                System.out.println("Comparision of " + arr[2] + " and " + arr[3]);
            cp++;
            }
        }
        System.out.println("Total Comparision: " + cp);
    }
    
    
    

    void display(){
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String[] args) {
        Task3 t3 = new Task3();
        System.out.println("Original Array:");
        t3.display();
        t3.sort();
        t3.display();
    }
}
