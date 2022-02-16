import java.util.Scanner;

public class A1E17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //definir variables
        int Lado1;
        int Lado2;
        int Lado3;

        //dedir los datos 
        System.out.print("Ingrese el primer lado: ");
        Lado1 = scanner.nextInt();
        System.out.print("Ingrese el segundo lado: ");
        Lado2 = scanner.nextInt();
        System.out.print("Ingrese el tercer lado: ");
        Lado3 = scanner.nextInt();
        
        //hacer copndiciones para ver en cual cumple
        if ((Lado1 == Lado2) && (Lado1 == Lado3)) {

            System.out.println("El tringulo es Equilatero");

        } else if ((Lado1 != Lado2) && (Lado1 != Lado3)&& (Lado2 != Lado3)) {

            System.out.println("El tringulo es Escaleno");

        } else {

            System.out.println("El tringulo es Isoceles");

        }
    }

}
