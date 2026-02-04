import java.util.Scanner;
public class Sieve {
    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;
    }
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n to find all prime numbers up to n: ");
        int n = scanner.nextInt();
        boolean[] primes = sieveOfEratosthenes(n);
        System.out.println("Prime numbers up to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}
