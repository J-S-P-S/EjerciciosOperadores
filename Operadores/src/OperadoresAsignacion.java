public class OperadoresAsignacion {


    public static void main(String[] args) {

        int i = 5, j = i + 4;

        //2 caminos para evaluar la misma expresión.
        i = i + 2;
        i += 2;
        System.out.println("i = " + i);
        i += 5;
        System.out.println("i = " + i);
        j -= 4;
        System.out.println("j = " + j);
        j *=3;
        System.out.println("j = " + j);
        //Pendiente poner los demás y realizar interfaz grafica.


    }
}
