import java.util.Scanner;

public class LoginArreglo {


    public static void main(String[] args) {

        String[] usuarios = new String[2];  //String[] usuarios = {"admin","Sebastian"};
        String[] claves = new String[2];    //String[] claves = {"1122334455","123456"};
        String u = "", p = "";
        boolean validar = false;

        usuarios[0] = "admin";
        claves[0] = "1122334455";

        usuarios[1] = "Sebastian";
        claves[1] = "123456";

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese usuario: " + u);
        u = leer.next();
        System.out.println("Ingrese clave: " + p);
        p = leer.next();


        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i].equals(u) && claves[i].equals(p)){
                validar = true;
                break;
            }
        }

        if (validar){
            System.out.println("Bienvenido usuario " + u);
        } else {
            System.out.println("Lo sentimos, necesita autorización.");
        }





    }
}
