public class main3 {
    public static void main(String[] args) {
        System.out.println(titleCase("java"));
        System.out.println(titleCase("JAVA"));
        System.out.println(titleCase("JaVa"));
    }

    static String titleCase(String texto) {
        if (texto == null || texto.isEmpty()) return texto;

        var primeraLetra = texto.substring(0, 1).toUpperCase();
        var restoDelTexto = texto.substring(1).toLowerCase();
        return primeraLetra + restoDelTexto;
    }
}
