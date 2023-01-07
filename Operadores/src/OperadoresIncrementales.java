public class OperadoresIncrementales {


    public static void main(String[] args) {

        // Pre incremento
        System.out.println("Pre incremento");
        int i = 1, j = ++i;

        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post incremento
        System.out.println("Post incremento");
        i = 2;
        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre decremento
        System.out.println("Pre decremento");
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post decremento
        System.out.println("Post decremento");
        i = 4;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("jPre = " + (++j));
        System.out.println("jPost = " + (j++));
        System.out.println("j = " + j);


    }

}
