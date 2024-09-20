import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        
        int rows, cols;
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        rows = sn.nextInt();
        System.out.print("Enter no of cols: ");
        cols = sn.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.println("Enter Elements of the Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sn.nextInt();
            }
            System.out.println();
        }
        System.out.println("Print Boundaries");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i==0 || j==0 || i==(rows-1) || j==(cols-1)) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("Print Center Part");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i==0 || j==0 || i==(rows-1) || j==(cols-1)) {
                    System.out.print("  ");
                } else {
                   
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

    }
}
