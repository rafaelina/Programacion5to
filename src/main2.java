public class main2 {
    public static void main(String[] args) {
        System.out.println(esVocal('a'));
        System.out.println(esVocal('B'));
        System.out.println(esVocal('E'));
    }

    static boolean esVocal(char letra) {
        var letraMinúscula = Character.toLowerCase(letra);
        return "aeiou".contains(Character.toString(letraMinúscula));
    }
}