package orgexamplesandbox.recursion;

public class GreatestCommonDriver {

    public static int gcd1(int a, int b) {

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }



    public static void main(String[] args) {
        System.out.println(gcd1(16, 56));
        System.out.println(gcd1(16, 56));
    }
}
