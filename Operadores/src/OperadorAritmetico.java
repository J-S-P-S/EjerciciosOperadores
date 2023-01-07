import javax.swing.*;

public class OperadorAritmetico {

    public static void main(String[] args) {

        int i = 8, j = 5, suma = i + j, resta = i - j, multi = i * j, div = i/j, resto = i % j, entrada = 0;
        float div2 = 0.0f;

        System.out.println("suma = " + suma);
        System.out.println("suma2 = " + (i + j));
        System.out.println("resta = " + resta);
        System.out.println("resta2 = " + (i - j));
        System.out.println("multi = " + multi);
        System.out.println("div = " + div);
        div2 = (float)i/(float)j; //se puede hacer cast a 1 de las 2 variables o a las 2, sin problema.
        System.out.println("div2 = " + div2);
        System.out.println("resto = " + resto);

        try {

            entrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        } catch (Exception e){

            JOptionPane.showMessageDialog(null,"Error, ingrese un número","Error",0);
            System.exit(0);
        };


        if (entrada == 0){

        } else{
            if(entrada % 2 == 0){

                JOptionPane.showMessageDialog(null,"El número " + entrada + " es par","Resultado",1);

            }else{

                JOptionPane.showMessageDialog(null,"El número " + entrada + " es impar","Resultado",1);

            }
        }




    }
}
