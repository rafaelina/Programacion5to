public class main8 {
    public static void main(String[] args) {
        System.out.println(main8("debug.sh"));
        System.out.println(main8("/path/to/debug.sh"));
        System.out.println(main8("/The.dot/file.java"));
        System.out.println(main8("no-extension"));
        System.out.println(main8("hidden.file."));
    }

    public static String main8(String ruta) {
        if (ruta == null || ruta.isEmpty()) return "";

        int punto = ruta.lastIndexOf('.');
        if (punto == -1 || punto == ruta.length() - 1) return "";

        return ruta.substring(punto + 1);
    }
}
