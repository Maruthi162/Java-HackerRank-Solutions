public class datatypes {

    public static void main(String[] args) {
        byte b = 2;
        System.out.println("byte value: " + b + " Size: " + Byte.SIZE / 8);
        short s = 200;
        System.out.println("Short: " + s + " Size of short=" + Short.SIZE / 8);
        int a = 5;
        System.out.println("Int: " + a + " Size=" + Integer.SIZE / 8);
        long l=234565434;
        System.out.println("Long: l"+ l+ " Size: "+Long.SIZE/8);
        float f = 2.3533533245235235f; // Output 2.3533533, allows only 7 decimal points
        System.out.println("Float Value: " + f + " size: " + Float.SIZE / 8);
        double d = 10.0343245335534; // output 10.0343245335534 allows 15 decimal points
        System.out.println("Double: " + d + " Size: " + Double.SIZE / 8);
        
        //theoriticallu boolean occupies 1bit, but practically it occupies atleast 1byte

    }

}
