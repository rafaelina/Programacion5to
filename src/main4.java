public class main4 {
    public static void main(String[] args) {
        System.out.println(terminaEnS("perros"));
        System.out.println(terminaEnS("gato"));
        System.out.println(terminaEnS("Sillas"));
        System.out.println(terminaEnS("s"));
    }

    static boolean terminaEnS(String texto) {
        if (texto == null || texto.isEmpty()) return false;
        return texto.endsWith("s");
    }
}
