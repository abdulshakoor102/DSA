public class DecimalToBinary {
    
        void dToBi(int no) {
            if (no / 2 > 0) {
                dToBi(no / 2);
            }
            System.out.print(no % 2);
    }
    

    public static void main(String[] args) {
        DecimalToBinary dtb = new DecimalToBinary();
        dtb.dToBi(12);
        System.out.println();
    }
}
