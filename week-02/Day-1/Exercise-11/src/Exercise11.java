public class Exercise11 {
    public static void main(String[] args) {
        int a = 3;
        // make it bigger by 10
        a += 10;
        System.out.println("make it 13");
        System.out.println(a);




        int b = 100;
        // make it smaller by 7
        b -= 7;
        System.out.println("make it 93");
        System.out.println(b);




        int c = 44;
        // please double c's value
        c *= 2;
        System.out.println("make it 88");
        System.out.println(c);




        int d = 125;
        // please divide by 5 d's value
        d /= 5;
        System.out.println("make it 25");
        System.out.println(d);




        int e = 8;
        // please cube of e's value
        int e3 = 8;
        e3 *= e;
        e3 *= e;
        System.out.println("make it 512");
        System.out.println(e3);




        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        Boolean truth;
        truth = f1 > f2;
        System.out.println("make it false");
        System.out.println(truth);




        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        g2 *= 2;
        //Boolean truth;
        truth = g2 > g1;
        System.out.println("make it true");
        System.out.println(truth);



        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        int divisor = 0;
        divisor = h % 11;
        //Boolean truth;
        truth = divisor == 0;
        System.out.println("make it false");
        System.out.println(truth);




        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        int i22 = 0;
        int i23 = 0;
        i22 = i2 * i2;
        i23 = i22 * i2;
        System.out.println("make it true");
        truth = i1 > i22;
        System.out.println(truth);
        System.out.println("make it true");
        truth = i1 < i23;
        System.out.println(truth);



        int j = 1521;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        int j3 = 0;
        int j5 = 0;
        System.out.println("make it true");
        j3 = j % 3;
        truth = j3 == 0;
        System.out.println(truth);
        System.out.println("make it false");
        j5 = j % 5;
        truth = j5 == 0;
        System.out.println(truth);




        String k = "Apple";
        //fill the k variable with its cotnent 4 times
        k = k + k + k + k;

        System.out.println("AppleAppleAppleApple");
        System.out.println(k);
    }
}
