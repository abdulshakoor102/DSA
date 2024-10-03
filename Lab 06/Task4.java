import java.util.Arrays;

public class Task4 {
    
    public static boolean findTwoSum(int[] arr, int K) {

        Arrays.sort(arr);
        

        int left = 0;
        int right = arr.length - 1;
        

        while (left <= right) {
            int currentSum = arr[left] + arr[right];
            
            if (currentSum == K) {

                if (left != right || (left == right && arr[left] * 2 == K)) {
                    return true;
                }
            }
            
            if (currentSum < K) {

                left++;
            } else {

                right--;
            }
        }
        

        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 6};
        int K = 10;
        

        if (findTwoSum(arr, K)) {
            System.out.println("Yes, there are two numbers that sum to " + K);
        } else {
            System.out.println("No, there aren't two numbers that sum to " + K);
        }
    }
}
