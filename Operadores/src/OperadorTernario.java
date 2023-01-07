import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        String variable = 7 == 7 ? "si es verdadero": "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2, mat = 0.0, cie=0.0,his=0.0;

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nota matemáticas: ");
        mat = leer.nextDouble();
        System.out.println("Ingrese nota ciencias: ");
        cie = leer.nextDouble();
        System.out.println("Ingrese nota historia: ");
        his = leer.nextDouble();

        promedio = (mat+cie+his)/3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49?"Aprobado":"Rechazado";
        System.out.println("estado = " + estado);

    }

}
