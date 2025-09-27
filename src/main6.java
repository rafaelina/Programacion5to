public class main6 {
    public static void main(String[] args) {
        System.out.println(main6("ab"));
        System.out.println(main6("ee"));
        System.out.println(main6("Aa"));
        System.out.println(main6("aA"));
        System.out.println(main6("xy"));
    }

    public static boolean main6(String texto) {
        if (texto == null || texto.length() != 2) return false;

        char primera = Character.toLowerCase(texto.charAt(0));
        char segunda = Character.toLowerCase(texto.charAt(1));
        return primera == segunda;
    }
}
