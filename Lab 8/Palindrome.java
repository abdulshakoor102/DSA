public class Palindrome {
    void palin(String st, int fIndex, int lIndex) {

        if (fIndex <= lIndex) {
            System.out.println("True");
            return;
        }
        
        if (st.charAt(fIndex) != st.charAt(lIndex)) {
            System.out.println("False");
            return;
        }
        
        palin(st, fIndex + 1, lIndex - 1);
    }
    

    public static void main(String[] args) {
        String st = "pop";
        Palindrome pl = new Palindrome();
        System.out.println(st);
        pl.palin(st, 0, st.length());
        
    }
}
