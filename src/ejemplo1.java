import java.util.Scanner;
public class ejemplo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digita un nombre");
        String nombre=sc.nextLine();
        String lenguaje=new String("Java");
        System.out.println("El nombre:"+nombre.toString()+" tiene:"+nombre.length()+" caracteres");

    }
}
