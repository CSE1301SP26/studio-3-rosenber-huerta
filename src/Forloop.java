import java.util.Scanner;
public class Forloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int num[] = new int[n];
        for (int i = 2; i <= n; i++) {
            num[i] = i;
             boolean prime = true;

            for (int k = 2; k < i; k++) {
                 if (num[i] % k == 0) {
                prime = false;
                break;
            }
        }

            if (prime) {
                System.out.print(num[i] + " ");
            }
        }

    }
}