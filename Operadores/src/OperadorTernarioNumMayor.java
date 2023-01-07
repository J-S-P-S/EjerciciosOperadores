import java.util.Scanner;

public class OperadorTernarioNumMayor {



    public static void main(String[] args) {

        int max = 0, num1,num2,num3,num4;//crear app mayor de 20 números interfaz grafica

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        num1 = leer.nextInt();

        System.out.println("Ingrese el segundo número: ");
        num2 = leer.nextInt();

        System.out.println("Ingrese el tercer número: ");
        num3 = leer.nextInt();

        System.out.println("Ingrese un cuarto número: ");
        num4 = leer.nextInt();

        max = (num1>num2)?num1:num2;
        max = (max>num3)?max:num3;
        max = (max>num4)?max:num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("El número mayor es: " + max);

    }

}
