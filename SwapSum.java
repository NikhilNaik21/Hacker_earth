import java.util.Arrays;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t > 0) {
            int n = sc.nextInt(); // Length of arrays A and B
            int k = sc.nextInt(); // Number of operations allowed

            int[] A = new int[n];
            int[] B = new int[n];
            int[] diff = new int[n];

            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                B[i] = sc.nextInt();
                diff[i] = A[i] - B[i];
            }

            Arrays.sort(diff);

            for (int i = 0; i < k; i++) {
                if (diff[i] < 0) {
                    A[i] = A[i] - diff[i];
                }
            }

            long maxSum = 0;
            for (int i = 0; i < n; i++) {
                maxSum += A[i];
            }

            System.out.println(maxSum);

            t--;
        }
    }
}
