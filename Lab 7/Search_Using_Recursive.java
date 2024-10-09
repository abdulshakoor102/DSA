import java.util.Random; 
import java.util.Scanner;       
public class Search_Using_Recursive {
    static long startTime1,startTime;

  static int  srchElement(int arr[], int n){
    startTime1 = System.nanoTime();	
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n) {
                return 1;
             }
        }
        return 0;
     }
// recursion
      static int i=9;
     static int findElements(int arr[],int n){
        startTime = System.nanoTime();
        if (i>=0) {
            
        
        if (arr[i]==n) {
            return 1;
            
        }else{
            i--;
            findElements(arr, n);
        }

        
    }
    return 0;
     }
    public static void main(String[] args) {
        int arr[]=new int[10];
        Random ra=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("In Itration way");
        System.out.println("Enter Number: ");
        int srch=sc.nextInt();
        
        for (int i = 0; i < 10; i++) {
         
            arr[i]=ra.nextInt()%100;
            
        }

      System.out.println(  srchElement(arr, srch));
      long endTime1  = System.nanoTime();	
      long totalTime1 = endTime1 - startTime1;
      if (srchElement(arr, srch)==0) {
        System.out.println("Element not found");
        
      }else{
        System.out.println("Element found");

      }
      System.out.println("In Recursive Way");

      System.out.println(srch);
      System.out.println(  findElements(arr, srch));
      long endTime   = System.nanoTime();
      long totalTime = endTime - startTime;
      if (findElements(arr, srch)==0) {
        System.out.println("Element not found");
        
      }else{
        System.out.println("Element found");

      }
     
      System.out.println("Finding out the time complexity ");
      System.out.println("Iterative time Complexity: "+totalTime1);
      System.out.println("Recursive time Complexity: "+totalTime);


      if (totalTime1>totalTime) {
        System.out.println("Iterative time complexity is greater than Recursive.");
      }else{
        System.out.println("Recursive time complexity is greater than Iterative.");

      }






    }
}
