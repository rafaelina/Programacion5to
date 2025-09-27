public class main11 {
    public static void main(String[] args) {
        System.out.println(main11("abc@me.com"));
        System.out.println(main11("abc@mecom"));
        System.out.println(main11("abc@me."));
        System.out.println(main11("abc@.com"));
        System.out.println(main11("@me.com"));
        System.out.println(main11("abc@@me.com"));
    }

    public static boolean main11(String correo) {
        if (correo == null || correo.isEmpty()) return false;
        int arroba = correo.indexOf('@');
        int ultimaArroba = correo.lastIndexOf('@');
        int punto = correo.lastIndexOf('.');
        if (arroba != ultimaArroba) return false;
        if (arroba < 1) return false;
        if (punto < arroba + 2) return false;
        if (punto >= correo.length() - 1) return false;
        return true;
    }
}
