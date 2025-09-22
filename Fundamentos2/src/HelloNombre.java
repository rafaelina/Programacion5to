import java.util.Scanner;
public class HelloNombre {
    public static void main(String[] args) {
        String nombre;
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite su nombre por favor");
        nombre=sc.nextLine();
        if(nombre.length()<10){
            System.out.println("Hola "+nombre+"!");
        }
    }
}
