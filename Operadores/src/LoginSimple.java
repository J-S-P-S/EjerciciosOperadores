import java.util.Scanner;

public class LoginSimple {



    public static void main(String[] args) {

        String user1 = "Sebastian";
        String pass1 = "123456";
        String user2 = "admin";
        String pass2 = "223344";

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese usuario: ");
        String u = leer.next();
        System.out.println("Ingrese clave: ");
        String p = leer.next();

        boolean validar = false;

        if( user1.equals(u) && pass1.equals(p) || user2.equals(u) && pass2.equals(p)){
            validar = true;
        } else{
            System.out.println("Usuario o clave incorrecto");
        }

        if (validar){
            //privada
            System.out.println("Bienvenido usuario " + u + "!");
        }else{
            //publica
            System.out.println("Lo siento, se requiere autenticación.");
        }


    }

}
