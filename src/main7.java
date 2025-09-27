public class main7 {
    public static void main(String[] args) {
        System.out.println(main7("/definitely-internal"));   // false
        System.out.println(main7("https://www.java.com"));   // true
        System.out.println(main7("http://dont-go.com"));     // true
        System.out.println(main7("ftp://server.com"));       // false
        System.out.println(main7(""));                        // false
    }

    public static boolean main7(String enlace) {
        if (enlace == null || enlace.isEmpty()) return false;

        return enlace.startsWith("http://") || enlace.startsWith("https://");
    }
}
