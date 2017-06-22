import java.util.Scanner;

/**
 * Created by lh
 * on 2017/5/19.
 */
public class Code17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = 0;
        while (in.hasNext()) {
            length = in.nextInt();
            int[] A = new int[length];
            for (int i = 0; i < length; i++) {
                A[i] = in.nextInt();
            }
            System.out.println(count(A, length));
        }
    }

    private static int count(int[] X, int n) {
        int sum = 0;
        int flag = 0;
        if (n <= 0)
            return 0;
        if (n <= 2)
            return 1;
        int i = 0;
        for (i = 0; i <= n - 1; i++) {
            if (i < n - 1 && X[i] <= X[i + 1]) {
                while (i < n - 1 && X[i] <= X[i + 1])
                    i++;
            } else if (i < n - 1 && X[i] >= X[i + 1]) {
                while (i < n - 1 && X[i] >= X[i + 1])
                    i++;
            }
            sum++;
            if (i == n - 1)
                break;
        }
        return sum;
    }
}
