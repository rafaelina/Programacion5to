public class main {

    public static void main(String[] args) {
        System.out.println(empiezaConMinuscula("manzana"));
        System.out.println(empiezaConMinuscula("Manzana"));
    }

    public static boolean empiezaConMinuscula(String s) {
        char primerCaracter = s.charAt(0);
        return Character.isLowerCase(primerCaracter);
    }
}