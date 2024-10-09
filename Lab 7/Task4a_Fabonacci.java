import java.util.Scanner;

public class Task4a_Fabonacci {
    // Through iterative
    public void generateFibonacci(int N) {
        int a = 0, b = 1;
        

        while (a <= N) {
            System.out.print(a + " ");
            int next = a + b; 
            a = b; 
            b = next;
        }
        
        System.out.println();
    }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task4a_Fabonacci t4 = new Task4a_Fabonacci();
        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();
        
        System.out.println("Fibonacci Series up to " + N + ":");
        t4.generateFibonacci(N);
        
        scanner.close();
    }
   
}
