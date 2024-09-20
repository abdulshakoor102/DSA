import java.util.Arrays;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        int arr[][] = new int[4][5];
        int arr1[] = new int[20];
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sn.nextInt();
            }
        }

        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int counter=0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                
                Boolean isDuplicate = false;
                for (int j2 = 1; j2 <= counter; j2++) {
                    if (arr[i][j] == arr1[j2]) {
                        isDuplicate = true;
                        break;
                    } 

                    
                }
            if (!isDuplicate) {
                if (counter < arr1.length) {
                    arr1[counter] = arr[i][j];
                    counter++;
                }
            }
            }
        }
        System.out.println("No Duplicate Numbers in Array");
        for (int i = 0; i < counter; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
