import java.util.Scanner;

public class Task4b_Fabonacci {
    // Through Recursion
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Task4b_Fabonacci t4 = new Task4b_Fabonacci();

        System.out.print("Enter a positive integer N: ");
        int N = scanner.nextInt();
        
        System.out.println("Fibonacci Series up to " + N + ":");
        

        for (int i = 0; i <= N; i++) {
            int fib = t4.fibonacci(i);
            if (fib > N) {
                break;
            }
            System.out.print(fib + " ");
        }
        
        System.out.println();
        scanner.close();
    }
    
}
