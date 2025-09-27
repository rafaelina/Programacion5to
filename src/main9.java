public class main9 {
    public static void main(String[] args) {
        System.out.println(main9(0, 0, 0));
        System.out.println(main9(255, 255, 255));
        System.out.println(main9(12, 15, 77));
        System.out.println(main9(128, 64, 32));
    }

    public static String main9(int r, int g, int b) {
        return String.format("%02X%02X%02X", r, g, b);
    }
}
