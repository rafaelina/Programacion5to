public class main1 {
    public static void main(String[] args) {
        System.out.println(pluralizar(1, "código"));
        System.out.println(pluralizar(2, "código"));
    }

    static String pluralizar(int conteo, String s) {
        return (conteo == 1) ? s : String.format("%d %ss", conteo, s);
    }
}