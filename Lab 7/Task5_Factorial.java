import java.util.*;
class Task5_Factorail{
   static double startTime, endTime, startTime1, endTime1;
   
    public static int factorial(int n){
         startTime1 = System.nanoTime();	//record the starting time 
           if (n==1) {
            return 1;
           }
         
         return n*factorial(n-1);

       }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Iterative Way");
        System.out.print("Enter an integer: ");
        int n=sc.nextInt();
      // iterative approach
      int sum=1;
      System.out.print(n+"!"+"  is  = ");
  for (int i = 1; i <=n; i++) {
       startTime = System.nanoTime();	//record the starting time 
         sum*=i;  
         System.out.print(i);

         if (i!=n) 
        System.out.print(" * ");
      }
      endTime   = System.nanoTime();	//record the ending time
      double totalTime = endTime - startTime;
      System.out.print(" = "+sum);
      System.out.println();
      System.out.println();
      System.out.println("Recursive Way: ");
      System.out.print("Enter Number: ");



      int n1=sc.nextInt();

      System.out.println(n1+"!= "+factorial(n1));
      endTime1  = System.nanoTime();	//record the ending time
      double totalTime1 = endTime1 - startTime1;
      System.out.println();
      System.out.println("Finding Time Complexity:");
      System.out.println("Iterative Time = " + totalTime1);
      System.out.println("Recursive Time = " + totalTime);

      if (totalTime<totalTime1) {
        System.out.println("Iterative Takes More Time Than Recursive");
      }else{
        System.out.println("Recursive Takes More Time Than Iterative"); 
      }





    }

}