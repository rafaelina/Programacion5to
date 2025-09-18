//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//import java.math.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Mi primer intento de programa-comentario
        int numero=1; //sentencias
        System.out.println("El valor de numero es: "+numero);
        numero*=5;
        numero--;
        double potencia=Math.pow(numero,2);
        System.out.println("El valor de numero ahora es: "+numero);
        System.out.println("La potencia del numero es: "+potencia);
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite un numero");
        numero=sc.nextInt();
        System.out.println("El numero digitado es: "+numero);
        /*subir a git
        * git init
           git add .
           *   git config --global user.email "you@example.com"
               git config --global user.name "Your Name"
           git commit -m "first commit"
            git remote add origin https://github.com/rafaelina/Programacion5to.git
            git push -u origin main
            **/
    }
}