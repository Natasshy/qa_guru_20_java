package guru.qa;

import static java.lang.Double.MAX_VALUE;

public class Main {
    public static void main(String[] args) {

        System.out.println("3 = " + (1+2));
        System.out.println("-1 =" + (1-2));
        System.out.println("2 = " + (1*2));
        System.out.println("0 = " + (1/2));
        System.out.println("1 = " + (1%2));

        int a =2;
        int b =3;
        int c = 4;
        int d =5;
        byte r = 127;
        short h = 32767;
        long q = 9223372036854775807L;
        float f = 1.1f;
        double g = 2345.1;

        System.out.println("byte + short = " + (r+h));
        System.out.println("long + short = " + (q+h));
        System.out.println("double + byte = " + (g+r));
        System.out.println("double + float = " + (g+f));

        if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

        if (a > b & c > d) {
            System.out.println(a);
        }
        else {
            System.out.println(c);
        }


        if (a > b && c > d) {
            System.out.println(a);
        }
        else {
            System.out.println(c);
        }

        if (a < b || c > d) {
            System.out.println(a);
        }
        else {
            System.out.println(c);
        }


        if (a > b ? true : false) {
            System.out.println("wow");
        }
        else {
            System.out.println("bee");
        }
    }
}