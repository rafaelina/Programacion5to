public class main5 {
    public static void main(String[] args) {
        System.out.println(main5("miércoles"));
        System.out.println(main5("jueves"));
        System.out.println(main5("sábado"));
        System.out.println(main5("S"));
        System.out.println(main5("sol"));
    }


    public static boolean main5(String texto) {
        if (texto == null || texto.isEmpty()) return false;

        char ultimoCaracter = texto.charAt(texto.length() - 1);
        return (ultimoCaracter == 's') || (ultimoCaracter == 'S');
    }
}
