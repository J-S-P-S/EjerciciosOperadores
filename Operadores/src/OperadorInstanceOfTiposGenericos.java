public class OperadorInstanceOfTiposGenericos {


    public static void main(String[] args) {

        //Pilas instaceof solo sirve con tipos de datos wrapper/referencia NO con tipos de datos primitivos
        Object texto = "Creando un objeto de la clase String... que tal!";

        Number num = Integer.valueOf(7);

        Double decimal = 45.54;

        Boolean b1 = texto instanceof String; //todas las clases y objetos son del tipo Object, heredan de la clase Object
        System.out.println("texto es del tipo String = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Integer = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean = " + b1);

    }

}
