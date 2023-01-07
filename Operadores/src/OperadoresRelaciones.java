public class OperadoresRelaciones {


    public static void main(String[] args) {

        int i = 3; byte j = 7; float k = 127f; double l = 2.1413e3; boolean m = false;

        boolean b = i == j;
        System.out.println("b = " + b);

        b = !b;
        System.out.println("b = " + b);

        boolean b2 = i !=j; //<> así se escribe el operador distinto en otros lenguajes.
        System.out.println("b2 = " + b2);

        boolean b3 = m == true;
        System.out.println("b3 = " + b3);
        b3 = m != true;
        System.out.println("b3 = " + b3);

        boolean b4 = i > j;
        System.out.println("b4 = " + b4);
        b4 = i < j;
        System.out.println("b4 = " + b4);

        boolean b5 = l >= k;
        System.out.println("b5 = " + b5);
        b5 = l <= k;
        System.out.println("b5 = " + b5);



    }

}
