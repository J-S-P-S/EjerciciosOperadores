public class OperadoresLogicos {


    public static void main(String[] args) {

        int i = 3; byte j = 7; float k = 127f; double l = 2.1413e3; boolean m = false;

        boolean b = i == j && k < l && m == false;
        System.out.println("b = " + b);

        boolean b1 = i == j || k < l;
        System.out.println("b1 = " + b1);

    }

}
