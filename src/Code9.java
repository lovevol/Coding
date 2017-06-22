import java.util.Scanner;

/**
 * Created by lh
 * on 2017/5/13.
 */
public class Code9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;
        int maxNow = 1000;
        int temp = 0;
        for (; ; ) {
            int n = scanner.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = scanner.nextInt();
            }
            for (int i = 1; i < n - 1; i++) {
                if ((temp = (x[i] - x[i - 1])) > max)//计算原数组差值的最大值
                    max = temp;
                if ((temp = (x[i + 1] - x[i - 1])) < maxNow)//计算现数组的差值最小值
                    maxNow = temp;
            }
            max = (temp = (x[n - 1] - x[n - 2])) > max ? temp : max;
            max = max > maxNow ? max : maxNow;
            System.out.println(max);
        }
    }
}
