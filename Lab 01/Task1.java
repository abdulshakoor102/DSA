import java.util.Arrays;
public class Task1 {
    public static void main(String[] args) {
        int arr[] = {2,5,8,3,4,1};
        for (int j = 0; j < arr.length-1; j++) {
            
        
        for (int i = 0; i < arr.length-1; i++) {
            
            if (arr[i] %2==0) {
                
            } else {
                int temp=0;
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
        System.out.println(Arrays.toString(arr));
    }
}
