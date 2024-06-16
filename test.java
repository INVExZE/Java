public class test {
    public static void main(String[] args) {
        int a = 384;
        byte b = (byte)(a);
        System.out.println(b);

        int c = 384;
        byte d = (byte)(c % 256);
        System.out.println(d);
    }
    
}
