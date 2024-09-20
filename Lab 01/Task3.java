import java.util.Arrays;;
public class Task3 {
    public static void main(String[] args) {
    
        String sentence = "What are you doing now";
        String Sent = "shakoor@gamil.com Ahmed mrKahn@gmail.com Khan";
        
        int counter = 0;
        int ctr = 0;
        
      
        
        for (int i = 0; i < sentence.length(); i++) { 
            if (sentence.charAt(i) == ' ') { 
                counter++;
            }
        }

        for (int i = 0; i < Sent.length(); i++) { 
            if (Sent.charAt(i) == '@') { 
                ctr++;
            }
        }
        
     
        System.out.println("Total Words Are : " + (counter + 1));
        System.out.print("Total Emails Are : " + (ctr));
    }
}
