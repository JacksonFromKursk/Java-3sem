package pr1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Integer h = sc.nextInt();
         Integer m = sc.nextInt();
        Function<Integer> function = (a, b) -> funk(a, b);
        System.out.println("gcd ="+function.gcd(h,m));
    }

    private static int funk(Integer a, Integer b) {
        int k = a;
        while (a%k !=0 || b%k !=0)
            k--;
        return  k;
    }

}
