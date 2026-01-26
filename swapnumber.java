public class swapnumber {
    public static void main(String[] args) {
        int a = 10;
        int b =20;
        System.out.println("Before swapnumber");
        System.err.println(" a = " + a + " b " + b);
         a = a+b;
         b = a-b;
         a = a-b;
         System.err.println("After swapnumber");
         System.err.println(" a = " + a + " b = " +b);

    }

}
