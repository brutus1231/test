import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long startTime = System.currentTimeMillis();
//        printPrimes(n);

        printEratostenesPrimes(n);

        long endTime = System.currentTimeMillis();
        System.out.println(((double)(endTime - startTime))/1000);
    }

    private static void printEratostenesPrimes(int n) {
        boolean[] primes = new boolean[n+1];

        Arrays.fill(primes, true);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i] == true) {
                for (int j = i * i; j <= n; j += i) primes[j] = false;
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primes[i] == true) {
                System.out.println(i);
            }
        }
//        IntStream.range(1, n)
//                .filter(t -> primes[t] == true)
//                .forEach(System.out::println);

    }

    private static void printPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
